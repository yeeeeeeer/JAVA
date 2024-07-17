-- build in functions
-- 문자열 관련 함수

SELECT ascii('A');
SELECT char(65);

-- CONCAT 문자열 이어붙이는 함수 (문자열 + 문자열)
SELECT concat('호랑이','돼지');
SELECT concat_ws(',','호랑이', '돼지');  -- 구분자 넣기
SELECT concat_ws('-', '2023','05','30');

-- ELT(위치, 문자열1, 문자열2,....) - FIELD(찾을 문자열, 문자열1, 문자열2,....)
-- FIND_IN_SET(찾을 문자열, 문자열 리스트..) INSTR(기존 문자열, 부분 문자열)
-- LOCATE(부분 문자열, 기준 문자열)
SELECT elt(2, '사과', '딸기', '바나나');  -- 해당 위치의 "문자열 반환"
SELECT field('딸기', '사과', '딸기', '바나나'); -- 찾을 문자열 "위치 반환"
SELECT find_in_set('바나나', '사과, 딸기, 바나나'); -- 찾을 문자열의 "위치 반환"
SELECT instr('사과딸기바나나','딸기'); -- 기존 문자열에서 부분 문자열의 "시작 위치 반환"
SELECT locate('딸기', '사과딸기바나나'); -- 찾을 문자열을 뒤에서 찾아서 위치 반환

-- FORMAT (숫자, 소수점 자릿수)
SELECT format(123123123123.345454, 3); -- 소수점 세자리에서 반환

-- BIN() OCT() HEX() 2진수 8진수 16진수
SELECT BIN(65), OCT(65), HEX(65);

-- INSERT(기준 문자열, 위치(띄어쓰기포함), 길이, 삽입할 문자열);
SELECT insert('내 이름은 아무개 입니다.',7,3,'홍길동');

-- LEFT(문자열, 길이) 왼쪽에서부터 반환/  RIGHT(문자열, 길이) 오른쪽에서부터 반환
SELECT left('HELLO WORLD',3), right('HELLO WORLD', 3);

-- UPPER(문자열), LOWER(문자열)  / 대문자 , 소문자 변환시킴
SELECT lower('Hello World'), upper('Hello World');

-- LPAD(문자열, 길이, 채울 문자열), RPAD(문자열, 길이, 채울 문자열) 문자열을 길이만큼 늘리고 길이 안의 빈 공간을 채울 문자열로 채운다(왼쪽에서부터, 오른쪽에서부터)
SELECT lpad('왼쪽',6,'@'), rpad('오른쪽',6,'@');

-- LTRIM(문자열), RTRIM(문자열) 공백제거 (왼쪽 오른쪽)
SELECT ltrim('      왼쪽'), rtrim('오른쪽      ');

-- TRIM(문자열) 기본 양쪽 공백 "제거"
-- LEADING(앞), BOTH(양쪽), TRAILING(뒤) 제거
SELECT trim('     MYSQL    ');
SELECT trim(BOTH '@' FROM '@@@MY SQL@@@'); 

-- REPEAT(문자열, 반복횟수) 문자열을 반복하는 함수
SELECT repeat('MYSQL',3);

-- REPLACE(문자열, 찾을 문자열, 바꿀 문자열) 문자열 바꾸는 함수
SELECT REPLACE('마이SQL', '마이', 'MY');

-- REVERSE(문자열) 문자열 반대로 뒤집기
SELECT reverse('STRESSED');

-- SPACE(길이) 길이만큼 공백만들기
SELECT concat('제 이름은', SPACE(5), '이고 나이는', SPACE(3), '세 입니다.');

-- SUBSTRING(문자열, 시작위치, 길이) 시작위치부터 길이만큼의 문자열을 반환 (길이 생략 시 시작위치부터 끝까지 다 반환)
SELECT substring('안녕하세요 반갑습니다', 7, 2);
SELECT substring('안녕하세요 반갑습니다', 7);  -- 길이 생략

-- SUBSTRING_INDEX(문자열, 구분자, 횟수)    횟수의 구분자부터 지워짐    <-잘 안씀
SELECT substring_index('hong.test@gmail.com','.',2);

-- ABS(숫자) 절댓값(음,양 상관없는 길이의 수) 보여주는 함수
SELECT abs(-123);

-- CEILING(숫자), FLOOR(숫자), ROUND(숫자) - 올림, 버림, 반올림
SELECT ceiling(12324.56), floor(1234.56), round(1234.56);

-- CONV(숫자, 원래 진수, 변환할 진수)  -- 현업은 x, 코테나 시험에서 나오는 함수
SELECT CONV('A', 16, 10);  -- A의 진수를 원래 진수 -> 변환할 진수로 바꾼다?

-- POW(숫자1, 숫자2) 숫자1을 숫자2만큼 곱하기?
-- SQRT(숫자) 제곱근 추출
SELECT pow(2,4);
SELECT sqrt(16);

-- RAND() 난수발생
-- 0 이상 1 미만의 실수
-- M과 N 사이의 임의의 정수를 구하려면
SELECT rand(), floor(RAND() * (11-1)+1);

-- SIGN(숫자) 양수면 1, 음수면 -1, 0이면 0 반환
SELECT sign(10.1), sign(0), sign(-10.1);

-- TRUNCATE(숫자, 정수)
-- 실수가 들어왔을 때 소수점을 기준으로 정수 위치까지 구하고 나머지는 버린다.
SELECT TRUNCATE(12345.12345,2), TRUNCATE(12345.12345,-2);

-- ADDDATE(날짜, 차이), SUBDATE(날짜, 차이) - 날짜에 차이만큼 더하기/빼기
SELECT adddate('2023-05-31', interval 30 day);
SELECT subdate('2023-05-31', INTERVAL 30 DAY);

-- ADDTIME(날짜/시간, 시간), SUBTIME(날짜/시간, 시간)  - 날짜/시간에 시간만큼 더하기/ 빼기
SELECT addtime('2023-05-31 09:00:00', '1:0:1');
SELECT subtime('2023-05-31 09:00:00', '1:0:1');

-- CURDATE(), CURTIME(), NOW(), SYSDATE() - 현재 날짜, 시간 나오는 함수 -- 실제로 사용 많이 한다
SELECT curdate(), curtime(), now(), sysdate();

SELECT year(curdate()), month(curdate()), dayofmonth(curdate());  -- 년, 월, 일 추출
SELECT hour(curtime()), minute(curtime()), second(current_time()), microsecond(current_time()); -- CURTIME과 CURRENT_TIME은 동일 기능가짐

-- 날짜랑 시간 따로따로 추출하기 NOW
SELECT DATE(now()), TIME(now());

-- DATEDIFF(날짜1, 날짜2), TIMEDIFF(날짜또는시간1, 날짜또는시간2)   --등록일에서 몇일이 지났는지,, 이럴때 쓰임
-- 앞에꺼에서 뒤에꺼를 뺀다
SELECT datediff('2024-05-30', NOW());
SELECT timediff('17:07:11', '13:06:10');

-- 요일, 달 반환
-- DATOFWEEK(날짜), MONTHNAME(), DAYOFYEAR(날짜)
SELECT DAYOFWEEK(CURDATE());
SELECT monthname(CURDATE());
SELECT dayofyear(CURDATE());  -- 올해 몇일째인지 알려줌

-- LAST_DAY(날짜) 해당달에서 마지막일이 언제인지
SELECT LAST_DAY('20230201'); -- 2월의 마지막 일

-- 해당연도에 정수만큼 지난날이 언제인지
-- MAKEDATE(년두,정수)
SELECT makedate(2024,32);

-- PERIOD_ADD(연월, 개월 수) 해당 연도에서 개월수가 지난 거
SELECT period_add(202305,6);

-- QUARTER(날짜) 해당 날짜의 분기(몇분기인지 구해준다)
SELECT quarter(curdate());

-- TIME_TO_SEC(시간)
-- 입력한 시간을 초 단위로 구함
SELECT TIME_TO_SEC('1:1:1');



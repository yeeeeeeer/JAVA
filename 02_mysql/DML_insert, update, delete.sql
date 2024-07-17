-- DML(Data Manipulation Language) 데이터 조작 언어
-- 데이터에 값을 삽입, 수정, 삭제하는 언어
-- insert, update, delete

-- insert : 테이블의 "행 추가"하는 구문

-- 1. insert into 테이블( )values( ) : 괄호 안 자유롭게 넣고싶은거 넣을 수 있음
INSERT INTO tbl_menu(
	
    menu_name,
    menu_price,
    category_code,
    orderable_status
)VALUES(

    '바나나 해장국',
    8500,
    4,
    'Y'
);
SELECT * FROM tbl_menu;

-- 2. insert into 테이블 values ( 순서대로 적기 )
INSERT INTO tbl_menu VALUES(null, '바나나 해장국', 8500, 4, 'Y');

-- 3.
INSERT INTO tbl_menu(
	orderable_status,
    menu_price,
    menu_name,
    category_code
)VALUES(
	'Y',
    5500,
    '파인애플탕',
    4
);

-- 4.
INSERT INTO tbl_menu
VALUES (
	null,
	'순대국밥',
	8500,
    (SELECT category_code FROM tbl_category WHERE category_name = '한식'),
	'Y'
);

-- 5.
INSERT INTO tbl_menu
VALUES 
	(null, '딸기아이스크림', 1700, 12, 'Y'),
    (null, '초코아이스크림', 1500, 11, 'Y');

SELECT * FROM tbl_menu;

-- update : 테이블에 기록된 컬럼 "값 수정"하는 구문. 전체 "행 갯수 변화 X"
UPDATE tbl_menu
SET menu_name = "델몬트바나나"   -- set 바꿀 새로운 대상
WHERE menu_name = "바나나 해장국";  -- where 바꾸고 싶은 대상

SELECT * FROM tbl_menu;

-- update에 서브쿼리 사용하기
UPDATE tbl_menu
SET category_code = 6
WHERE menu_price IN (
	SELECT 
	menu_price
    FROM (SELECT * FROM tbl_menu) AS a  -- from에 서브쿼리 : 별칭 꼭 해줘야함
    WHERE menu_name = '델몬트바나나'
);

SELECT * FROM tbl_menu;

-- delete : 행 삭제하는 구문. 테이블의 행 갯수 줄어듬. 
-- 현업에서는 delete 거의 사용 안함(데이터 삭제되기때문에) -> status로 관리한다(데이터 유지하면서)
-- DELETE FROM tbl_menu <- 이건 다 지워져버리니까 주의하기 / 어떤거 지울지 추가로 써주기
DELETE FROM tbl_menu
WHERE menu_name = '델몬트바나나';

SELECT * FROM tbl_menu;

-- delete + limit 사용해보기
DELETE FROM tbl_menu
ORDER BY menu_price DESC
LIMIT 2;  -- 제일 높은가격 두개가 삭제된다

SELECT * FROM tbl_menu ORDER BY menu_price DESC;

SELECT
	*
FROM tbl_menu
WHERE orderable_status = 'Y';

UPDATE tbl_menu SET orderable_status = 'N'
WHERE menu_code = 26;

-- insert 시 충돌이 발생한다면 replace 로 중복된 데이터를 덮어 쓸 수 있다.
INSERT INTO tbl_menu VALUES (1, '참기름라떼', 5000, 10, 'Y');
REPLACE INTO tbl_menu VALUES (1, '참기름라떼', 5000, 10, 'Y');  -- replace : 없으면 추가, 있으면 교체
SELECT * FROM tbl_menu;
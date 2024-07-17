-- select 가장 기본적인 명령어 . (데이터 조회 기능)

-- 명령어는 대문자(규칙)
-- ctrl + b :자동정렬
-- 세미콜론 범위로 실행 : ctrl + enter
-- 전체 실행 : ctrl + shift + enter

SELECT 
    *
FROM
    tbl_menu;
    
SELECT 
    menu_name
FROM
    tbl_menu;
    
SELECT 
    menu_code, menu_name, menu_price
FROM
    tbl_menu;
    
SELECT 6 + 3;
SELECT 6 * 3;

SELECT now();
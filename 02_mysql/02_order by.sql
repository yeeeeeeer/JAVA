-- order by 정렬하는 기능

SELECT 
    menu_code, 
    menu_name, 
    menu_price
FROM
    tbl_menu
ORDER BY menu_price ASC;   -- ASC 오름차순 정렬

SELECT 
    menu_code, 
    menu_name, 
    menu_price
FROM
    tbl_menu
ORDER BY menu_price DESC;   -- DESC 내림차순 정렬

SELECT
	menu_code,
	menu_name,
    menu_price
FROM tbl_menu
ORDER BY
	menu_price DESC, -- 1순위 
    menu_name ASC; -- 2순위
    
SELECT
	menu_code,
    menu_price,
    menu_code * menu_price 
FROM tbl_menu
ORDER BY menu_code * menu_price DESC;

SELECT
	menu_code,
    menu_price, 
    (menu_code * menu_price) AS multi
FROM tbl_menu
ORDER BY multi DESC;

SELECT field('a','a','b','c');  -- field : 제일 첫번째를 기준으로 1,2,3...

SELECT
	menu_name,
    orderable_status
FROM tbl_menu
ORDER BY field(orderable_status, 'N', 'Y');  -- orderable_status 기준으로 'N'->'Y' 순으로 나옴

SELECT
	category_code,
    category_name,
    ref_category_code
FROM tbl_category
ORDER BY
	ref_category_code;
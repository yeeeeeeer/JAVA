-- union : 쿼리문을 합쳐서 보여준다

SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE category_code = 10
UNION -- 위, 아래 select 중복값 제외하고 보여준다
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE menu_price < 9000;




SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE category_code = 10
UNION ALL -- 위, 아래 select 값 전부 다 보여준다
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE menu_price < 9000;
-- group by : 특정 값에 따라서 그룹화하는데 사용한다
SELECT
	category_code
FROM tbl_menu
GROUP BY category_code;

-- count()
SELECT
	category_code,
    count(*) -- * : 모든 갯수
FROM tbl_menu
GROUP BY category_code;    -- category_code 안에 갯수를 알려줌

-- sum() : 합계
SELECT
	category_code,
    sum(menu_price)
FROM tbl_menu
GROUP BY category_code;

-- AVG() : 평균값
SELECT
	category_code,
    AVG(menu_price)
FROM tbl_menu
GROUP BY category_code;

-- 여러가지 그룹
SELECT
	menu_price,
    category_code
FROM tbl_menu
GROUP BY
	menu_price,
    category_code;
    
-- HAVING()
SELECT
	menu_price,
    category_code
FROM tbl_menu
GROUP BY
	menu_price,
    category_code
HAVING
	category_code >= 5 AND category_code <= 8;
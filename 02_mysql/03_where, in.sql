-- where 특정 조건에 맞는 레코드만 선택하는데 사용

SELECT
	menu_name,
    menu_price,
    orderable_status
FROM tbl_menu
WHERE orderable_status = 'Y';  -- Y 인 것들만 출력

SELECT 
    menu_code, 
    menu_name, 
    orderable_status
FROM
    tbl_menu
WHERE
    orderable_status != 'Y';  -- 'Y' 아닌 것들 출력
    
SELECT
	menu_code,
    menu_name,
    menu_price
FROM tbl_menu
WHERE menu_price >= 20000;  -- 비교연산자 사용 가능

SELECT
	menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE
	orderable_status = 'Y' AND   -- and 연산자 사용 (둘다 true)
    category_code = 10;
    
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE
	menu_price > 5000 AND
    category_code = 10;
    
SELECT
	menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE
	orderable_status = 'Y' OR
    category_code = 10  -- 조건
ORDER BY category_code;  -- 정렬기준

SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE
	category_code = 4 OR
    menu_price = 9000 AND
    menu_code > 10;   -- 순위 and -> or 
    
SELECT
	menu_name,
    menu_price,
    category_code
FROM tbl_menu
WHERE
	menu_price BETWEEN 10000 AND 25000
    ORDER BY menu_price;

SELECT
	menu_name,
    menu_price,
    category_code
FROM tbl_menu
WHERE
	menu_price NOT BETWEEN 10000 AND 25000
    ORDER BY menu_price;
    

-- Like : %로 텍스트 찾기같은 기능
SELECT
	menu_name,
    menu_price
FROM tbl_menu
WHERE
	menu_name LIKE '%마늘%'  -- %% : 텍스트 사이 / %텍스트 : / 텍스트%
ORDER BY menu_name;

SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE
	menu_price > 5000 AND
    category_code = 10 AND
    menu_name LIKE '%갈치%';
    
SELECT
	menu_name,
    menu_price
FROM tbl_menu
WHERE
	menu_name NOT LIKE '%마늘%'
ORDER BY menu_name;


-- in : 괄호 안에 있는 것들 조회
SELECT
	menu_name,
    category_code
FROM tbl_menu
WHERE category_code IN (4,5,6)
ORDER BY category_code;

SELECT
	menu_name,
    category_code
FROM tbl_menu
WHERE category_code NOT IN (4,5,6)
ORDER BY category_code;


-- is null : null 인 것들 조회
SELECT
	category_code,
    category_name,
    ref_category_code
FROM tbl_category
WHERE ref_category_code IS NULL;

SELECT
	category_code,
    category_name,
    ref_category_code
FROM tbl_category
WHERE ref_category_code IS NOT NULL;

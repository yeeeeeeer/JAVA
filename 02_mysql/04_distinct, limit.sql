-- distinct : 중복 값 제거
SELECT DISTINCT
    category_code
FROM
    tbl_menu
ORDER BY category_code;

-- 다중 열 distinct
SELECT DISTINCT
category_code,
orderable_status   -- category_code 랑 orderable_status 둘다 중복인 경우를 제외해줌
FROM tbl_menu;


-- LIMIT 반환할 행의 수를 제한하는 기능  / 게시물의 페이지 갯수 제한할때 자주 씀
SELECT 
    menu_code, 
    menu_name, 
    menu_price
FROM
    tbl_menu
ORDER BY menu_price DESC
LIMIT 1 , 4;  -- 1제외하고 다음부터 ~ 4개 조회한다

SELECT
	menu_code,
    menu_name,
    menu_price
FROM tbl_menu
ORDER BY menu_price DESC
LIMIT 5; -- 상위 5개 조회
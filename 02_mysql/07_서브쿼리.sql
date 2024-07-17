-- 서브쿼리 : 쿼리문 안에 서브쿼리가 들어간다

SELECT -- 메인쿼리
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE category_code = (
	SELECT -- 서브쿼리
		category_code
	FROM tbl_menu
    WHERE menu_name = "민트미역국");
-- 서브쿼리 from - where - select
-- 메인쿼리 from - where - select


-- max() 제일 큰 값 호출
SELECT max(menu_price) FROM tbl_menu;

SELECT
	max(count)
FROM(
	SELECT
		count(*) AS 'count'
	FROM tbl_menu
	GROUP BY category_code
	)AS countMenu;  -- "FROM(쿼리문 생성)" 이면 괄호 뒤에 AS로 별칭 지어줘야함
 
-- 평균 가격보다 높은 가격의 메뉴들 조회하기
-- 메인쿼리 - where 가격 > (서브쿼리 - 평균가격);
SELECT
	menu_name,
    menu_price,
    category_code,
    orderable_status
FROM tbl_menu
WHERE menu_price > (
	SELECT
		AVG(menu_price)
	FROM tbl_menu
);

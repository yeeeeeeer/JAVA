-- join : 두 개 이상의 테이블을 결합하는 기능 (연관있는 데이트 조합해서 하나로 뽑아냄)

-- AS : 별칭 짓는 기능
SELECT
	menu_code AS 'code',
    menu_name AS name,
    menu_price 'price'
FROM tbl_menu
ORDER BY price;

-- 테이블에 별칭 지어줌
SELECT
	a.category_code,
    a.menu_name
FROM tbl_menu AS a
ORDER BY 
	a.category_code,
    a.menu_name;
    
-- inner join (교집합 반환)
SELECT
	a.menu_name,
    b.category_name
FROM tbl_menu AS a
JOIN tbl_category b ON a.category_code = b.category_code; -- 순서: from - join - on - select

SELECT
	a.menu_name,
    b.category_name
FROM tbl_menu a
INNER JOIN tbl_category b USING (category_code); -- from - join - using()과 연관있는 것들 조회

-- left join : 두 테이블 중 왼쪽 자신 전부다 + 오른쪽과의 교집합을 가져온다 / A left join B : A가 왼쪽 자신
SELECT
	a.category_name,
    b.menu_name
FROM tbl_category a 
LEFT JOIN tbl_menu b ON a.category_code = b.category_code;

-- right join : 두 테이블 중 오른쪽 자신 전부다 + 왼쪽과의 교집합을 가져온다 / A right join B : B가 오른쪽 자신
SELECT
	a.category_name,
    b.menu_name
FROM tbl_category a
RIGHT JOIN tbl_menu b ON a.category_code = b.category_code;  -- ON 조건부분

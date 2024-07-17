-- TRANSACTION : 데이터베이스에서 한번에 수행되는 작업단위
-- 시작, 진행, 종료 단계를 거치며 중간에 오류가 발생하면 ROLLBACK 을 수행하고
-- 제대로 반영하기 위해서는 COMMIT 을 진행한다

SET autocommit = 0;  -- 0 : off(끄기)

START TRANSACTION;

SELECT * FROM tbl_menu;
INSERT INTO tbl_menu VALUES (null, '바나나해장국', 8500, 4, 'Y');
UPDATE tbl_menu SET menu_name = '수정된 메뉴' WHERE menu_code = 5;
DELETE FROM tbl_menu WHERE menu_code = 7;

ROLLBACK; -- TRANSACTION ~ ROLLBACK 사이에 있는 것들 실행 안시킴

SET autocommit = 1; -- 1 : on(켜기)

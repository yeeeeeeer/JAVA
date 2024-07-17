-- DDL (Data Definition Language)
-- 데이터베이스의 스키마(구조같은거)를 정의 or 수정하는데 사용한다

-- CREATE : 테이블 생성을 위한 구문
-- IF NOT EXISTS 를 적용하면 기존의 테이블 이미 존재하더라도 에러가 발생 X

CREATE TABLE IF NOT EXISTS tb1 (
	-- 이름, 자료형, 식별키
    pk INT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255), -- varchar() : 문자열(받을 공간 지정)
    CHECK (col1 IN ('Y', 'N')) -- check : 제약조건 (col1안에 'Y''N' 만 받겠다)
)ENGINE = InnoDB; -- InnoDB 라는걸로 생성

DESCRIBE tb1;

INSERT INTO tb1 VALUES(1, 10, 'Y');

SELECT * FROM tb1;

CREATE TABLE IF NOT EXISTS tb2 (
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
	col1 VARCHAR(255),
    CHECK (col1 IN ('Y', 'N'))
)ENGINE = InnoDB;

DESCRIBE tb2;

INSERT INTO tb2 VALUES (null, 10, 'Y');
INSERT INTO tb2 VALUES (null, 20, 'Y');
INSERT INTO tb2 VALUES (null, 30, 'Y');

SELECT * FROM tb2;

-- ALTER : 테이블에 추가, 변경, 삭제 하는 모든 것은 ALTER 명령어를 사용해서 적용한다
-- 종류가 너무 많고 복잡하므로 대표적인 것들 살펴본다.

-- add : 추가
ALTER TABLE tb2
ADD col2 INT;

DESCRIBE tb2;

-- drop column : 삭제
ALTER TABLE tb2
DROP COLUMN col2;

DESCRIBE tb2;

-- 열 이름 넣기, 형식 바꿔보기
ALTER TABLE tb2
-- CHANGE COLUNM 바꿀 대상(fk) + 바뀔 이름(change_fk) + 바뀔 것에 대한 정보
CHANGE COLUMN fk change_fk INT NOT NULL;

DESCRIBE tb2;

-- 제약조건 삭제해보기
-- 1. 먼저 auto 삭제 (auto 되있으면 삭제가 안됨)
ALTER TABLE tb2
MODIFY pk INT;  

-- 2. drop 으로 삭제하기
ALTER TABLE tb2
DROP PRIMARY KEY;

DESCRIBE tb2;

-- DROP : 데이터 삭제를 위한 구문
DROP TABLE IF EXISTS tb1, tb2; 

DESCRIBE tb2;
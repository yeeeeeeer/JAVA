-- CONSTRAINIS
-- 제약조건 = 테이블에 데이터가 입력되거나 수정될 때의 규칙을 정의한다.
-- 테이블 작성 시 각 컬럼에 "값 기록에 대한 제약조건을 설정"할 수 있다.
-- 데이터 무결성 보장을 목적으로 한다.
-- 입력 / 수정하는 데이터에 문제가 없는지 자동으로 검사해주게 하기위한 목적이다.

-- MYSQL 에서 사용할 수 있는 제약조건의 종류
-- primary key / not null / unique / check / foreign key

-- 1. not null : null 값을 허용 X 
-- 데이터 입력 시 꼭 들어가야하는 내용(필수입력부분), 선택사항이면 not null 빼도됨
DROP TABLE IF EXISTS user_notnull;
CREATE TABLE IF NOT EXISTS user_notnull(
	user_no INT NOT NULL,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gendar VARCHAR(3) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255)
)ENGINE = InnoDB;

INSERT INTO user_notnull
VALUES
	(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', NULL),
    (2, 'user02', 'pass02', '유관순', '여', '010-7777-7777', 'yu77@gmail.com');
    
SELECT * FROM user_notnull;

-- 2. UNIQUE 제약조건 : 중복값 허용 X
DROP TABLE IF EXISTS user_unique;
CREATE TABLE IF NOT EXISTS user_unique(
	user_no INT NOT NULL UNIQUE,  -- 표기법 1
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gendar VARCHAR(3),
    PHONE VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    UNIQUE(phone)  -- 표기법 2
)ENGINE = InnoDB;

INSERT INTO user_unique
	VALUES
		(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com'),
		(1, 'user01', 'pass01', '홍길동', '남', '010-9999-5678', 'hong123@gmail.com');

SELECT * FROM user_unique;

-- PRIMARY KEY : 테이블에 대한 식별자 역할 (한 행의 정보를 찾기위해 사용할 컬럼)
-- not null + unique 제약조건 의미
-- 한 테이블당 한 개만 설정 가능
-- 한 개 컬럼에 설정 O or 여러 개의 컬럼 묶어서 설정도 O (복합키)
DROP TABLE IF EXISTS user_primarykey;
CREATE TABLE IF NOT EXISTS user_primarykey(
	user_no INT PRIMARY KEY,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gendar VARCHAR(3),
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255)
    -- PRIMARY KEY(user_no)
)ENGINE = InnoDB;

INSERT INTO user_primarykey
	VALUES
		(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong@gmail.com'),
		(2, 'user02', 'pass02', '유관순', '여', '010-7777-7777', 'yu77@gmail.com');
INSERT INTO user_primarykey
	VALUES
		(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong@gmail.com');
        

-- FOREIGN KEY : 참조된 다른 테이블에서 제공하는 값만 사용 가능
-- 참조 무결성을 위배하지 않기 위해 사용
-- FOREIGN KEY 제약조건에 의해서 테이블간의 관계가 성립됨
-- 제공되는 값 외에는 NULL 사용 가능
-- FOREIGN KEY로 설정되어있는 경우 컬럼 변경 X

DROP TABLE IF EXISTS user_grade;
CREATE TABLE IF NOT EXISTS user_grade(
	grade_code INT NOT NULL UNIQUE,
    grade_name VARCHAR(255) NOT NULL
)ENGINE = InnoDB;

INSERT INTO user_grade
VALUES
	(10, '일반회원'),
	(20, '우수회원'),
	(30, '특별회원');
SELECT * FROM user_grade;

-- DROP TABLE IF EXISTS user_foreignkey1;
CREATE TABLE IF NOT EXISTS user_foreignkey1(
	user_no INT PRIMARY KEY,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gendar VARCHAR(3),
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    grade_code INT,
    -- grade_code 를 참조해서 FOREIGN KEY로 연결했다는 뜻
    FOREIGN KEY (grade_code) REFERENCES user_grade (grade_code)
)ENGINE = InnoDB;

INSERT INTO user_foreignkey1
VALUES
	(1, 'user01', 'pass01', '홍길동', '남', '010-1234-1234', 'hong@gmail.com', 10),
	(2, 'user02', 'pass02', '유관순', '여', '010-2222-2222', 'yu22@gmail.com', 20);
    
INSERT INTO user_foreignkey1
VALUES
	(1, 'user01', 'pass01', '홍길동', '남', '010-1234-1234', 'hong@gmail.com', 50); -- 오류
    
SELECT * FROM user_foreignkey1;

UPDATE user_foreignkey1
SET grade_code = 1
WHERE grade_code = 10;
SELECT * FROM user_foreignkey1;


DROP TABLE IF EXISTS user_foreignkey2;
CREATE TABLE IF NOT EXISTS user_foreignkey2 (
	user_no INT PRIMARY KEY,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gendar VARCHAR(3),
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    grade_code INT,
    -- grade_code 를 참조해서 FOREIGN KEY로 연결했다는 뜻
    FOREIGN KEY (grade_code) REFERENCES user_grade (grade_code)
		ON UPDATE SET NULL
        ON DELETE SET NULL
)ENGINE = InnoDB;

INSERT INTO user_foreignkey2
VALUES
	(1, 'user01', 'pass01', '홍길동', '남', '010-1234-1234', 'hong@gmail.com', 10),
	(2, 'user02', 'pass02', '유관순', '여', '010-2222-2222', 'yu22@gmail.com', 20);
    
SELECT * FROM user_foreignkey2;

UPDATE user_grade
SET grade_code = 1
WHERE grade_code = 10;

SELECT * FROM user_foreignkey2;

DELETE FROM user_grade
WHERE grade_code = 20;

SELECT * FROM user_foreignkey2;

-- CHECK : 제약조건 위반 시 허용하지 않는 제약 "조건"
DROP TABLE IF EXISTS user_check;
CREATE TABLE IF NOT EXISTS user_check(
	user_no INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    gendar VARCHAR(3) CHECK(gendar IN ('남', '여')),
    age INT CHECK (age >= 19)
)ENGINE = InnoDB;

INSERT INTO user_check
VALUES
	(NULL, '홍길동', '남', 25),
	(NULL, '이순신', '남', 33);
SELECT * FROM user_check;

INSERT INTO user_check
VALUES
	(NULL, '홍길동', '남성', 25);
INSERT INTO user_check
VALUES
	(NULL, '홍길동', '남', 15);
SELECT * FROM user_check;

    
-- DEFAULT : 칼럼에 NULL 대신 기본 값 적용
-- 컬럼 타입이 DATE 일 시 < current_data > 만 가능
-- 칼럼 타입이 DATETIME 일 시 < current_time, current_timestamp, now() > 모두 가능

DROP TABLE IF EXISTS tbl_country;
CREATE TABLE IF NOT EXISTS tbl_country(
	country_code INT AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(255) DEFAULT '한국',
    population VARCHAR(255) DEFAULT '0명',
    add_day DATE DEFAULT (current_date),
    add_time DATETIME DEFAULT (current_time)
)ENGINE = InnoDB;

INSERT INTO tbl_country
VALUES (NULL, DEFAULT, DEFAULT, DEFAULT, DEFAULT);

SELECT * FROM tbl_country;


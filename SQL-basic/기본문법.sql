# 내용 
-- 내용
/* 부분 주석 */
/*
여러줄
주석
*/

# DDL (데이터 정의어)
-- 데이터베이스 혹은 테이블(뷰, 인덱스, 프로시저 ... )을 생성, 수정, 삭제할 때
-- 사용하는 SQL문

-- 데이터베이스 생성
-- CREATE DATABASE 데이터베이스명;

CREATE DATABASE Hotel;

SHOW DATABASES;

-- 데이터베이스를 생성했으면 사용할 데이터베이스를 선택
-- USE 데이터베이스명;

USE hotel;

# 테이블 생성
# CREATE TABLE 테이블명 (
# 	필드명 데이터타입(데이터길이) 제약조건, 
# 	...
# );

CREATE TABLE Custom (
	id INT PRIMARY KEY, 
    name VARCHAR(20) NOT NULL,                      # VARCHAR = Variable Character
    email VARCHAR(30) UNIQUE,
    age INT,
    address TEXT,
    accept_marketing BOOLEAN DEFAULT false          # 단어를 쓸때 띄어쓰기는 언더바로 표시     
);

SHOW TABLES;

# 데이터베이스 수정
# ALTER DATABASE 데이터베이스명 수정할속성명=값;

# 테이블 수정 
# ALTER TABLE 테이블명

# 테이블 필드 추가
# ALTER TABLE 테이블명 ADD 필드명 데이터타입(데이터길이) 제약조건;
# 테이블 필드 삭제
# ALTE TABLE 테이블명 DROP 필드명;
# 테이블 필드 수정
# ALTER TABLE 테이블명 MODIFY COLUMN 필드명 데이터타입(데이터길이) 제약조건;

# 데이터베이스 삭제
# DROP DATABASE 데이터베이스명;

# 테이블 삭제
# DROP TABLE 테이블명;
# TRUNCATE TABLE 테이블명; 

# DROP TABLE 테이블명 : 테이블의 정의 자체를 제거
# TRUNCATE TABLE 테이블명 : 테이블을 정의만 남기고 모두 제거. 초기화(생성 초기 상태로 돌려놓음. Reset과 같은 개념)

# 초기 테이블을 생성할 때 실제 비즈니스상 주체가 무엇인지, 파생되는 요소가 무엇인지 파악하고 작성하기


-- DML(데이터 조작어)
-- 데이터베이스 테이블에 레코드를 삽입, 수정, 삭제, 검색 작업을 수행시키고자 할 때 사용하는 SQL문

-- 삽입문 (INSERT INTO)
-- 해당 테이블에 레코드를 삽입할 때 사용하는 SQL 구문
-- INSERT INTO 테이블명(필드명1, 필드명2, ...)
-- VALUES (필드1의 데이터, 필드2의 데이터, ...);

INSERT INTO Custom(id, name) VALUES (1, 'John Doe');
INSERT INTO Custom(id, email) VALUES (5, 'qwer@qwer'); -- 필수 값 미입력 오류
INSERT INTO Custom(id, name, email) VALUES (1, 'John Doe', 'qwer@qwer'); -- 기본키 중복 오류 

SELECT * FROM Custom;

-- 모든 필드에 값을 넣을 때 :
-- INSERT INTO 테이블명
-- VALUES (데이터1, 데이터2, ...);
-- 보기 힘들 수는 있으나, 필드가 굉장히 많을 때는 이 문법이 더 편할 수 있음

INSERT INTO Custom 
VALUES (10, 'Michael', 'qwer@qwer.com', 30, 'This is Address', true);

INSERT INTO Custom
VALUES (11, 'lacls159@gmail.com', 'Jihoon', 31, 'Busan', true);

INSERT INTO Custom 
VALUES (12, 'Michael', 'qwe1r@qwer.com', 30, 'This is Address'); -- column의 갯수 상이 오류 

-- 수정문 (UPDATE)
-- 해당 테이블에서 특정 필드의 값을 수정하고자 할 때 사용하고자 하는 SQL문

-- UPDATE 테이블명 SET 필드명1=데이터1, 필드명2=데이터2, ...;
UPDATE Custom SET accept_marketing = false;  -- 1175 error 수정작업할 때 기본키를 필수입력하게 설정되어 있음. preference에서 해당 설정 해제로 해결 
UPDATE Custom SET accept_marketing = true, age = 10;

-- UPDATE 테이블명 SET 필드명1=데이터1, ...
-- WHERE 필드명 = 데이터;
UPDATE Custom SET email = 'email@email.com'
WHERE id = 1;  -- 마지막 세미콜론부터 다음 세미콜론까지의 코드를 실행하기 때문에 코드 중간 enter는 관계가 없음 
-- WHERE문에 대한 공부, 연습 많이하기 

-- 삭제문 (DELETE)
-- 해당 테이블에서 레코드를 삭제할 때 사용하는 SQL문

-- DELETE FROM 테이블명;
DELETE FROM Custom;

-- DELETE FROM 테이블명 WHERE 조건;
DELETE FROM Custom WHERE name = 'John Doe';

-- 검색문 (SELECT)
-- 해당 테이블에서 특정 필드를 검색하고자 할 때 사용하는 SQL문

-- SELECT 필드명1, 필드명2, ... FROM 테이블명; 
SELECT id, name FROM Custom;

-- SELECT * FROM 테이블명;
SELECT * FROM Custom;

-- 필드에 별칭 사용 
SELECT name AS 'Full Name' 
FROM Custom;

-- 테이블에 별칭 사용
SELECT name
FROM Custom AS C;

-- 중복 제거 (DISTINCT)
SELECT DISTINCT name FROM Custom;
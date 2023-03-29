-- 기차 예약 데이터베이스 생성
CREATE DATABASE train_reservation;
USE train_reservation;

DROP TABLE Cost;

-- 가격 테이블 생성 
CREATE TABLE Cost (
	departure_station INT NOT NULL,
    arrival_station INT NOT NULL,
    amount INT NOT NULL 
);

CREATE TABLE Train (   -- 관리해야할 오브젝트와 각각의 데이터 타입을 정함
	train_number VARCHAR(10) PRIMARY KEY,     
    departure_station VARCHAR(50) NOT NULL,  -- 필수값에는 NOT NULL,  
    departure_time TIME NOT NULL,		     -- 중복허용 안될경우 UNIQUE를 제약조건으로 설정
    arrival_station VARCHAR(50) NOT NULL,	 -- PRIMARY KEY로 지정하는 값에는 NOT NULL과 UNIQUE가 포함되어있음
    arrival_time TIME NOT NULL,
    take_minute TIME NOT NULL,
    type VARCHAR(10) NOT NULL
);

CREATE TABLE Station (
	station_number INT AUTO_INCREMENT PRIMARY KEY,  -- 테이블의 열(column)에 대해 자동으로 증가하는 숫자 값을 할당하는 기능
    station_name VARCHAR(50) NOT NULL,
    address VARCHAR(500) NOT NULL UNIQUE,
    tel_number VARCHAR(15) NOT NULL UNIQUE
    );

CREATE TABLE STOP_STATION (
station_name INT NOT NULL,
train_number VARCHAR(10) NOT NULL,
departure_time TIME NOT NULL,
arrival_time TIME NOT NULL
);

CREATE TABLE SEAT (			              -- 복합 PRIMARY KEY ?
	seat_code VARCHAR(5) PRIMARY KEY,     -- train에 종속되게 만들어도 될 것 같음
	type VARCHAR(10) NOT NULL,                     -- 일반실 특실
    seat_number VARCHAR(2) NOT NULL,
    train_type VARCHAR(10) NOT NULL
);

ALTER TABLE Cost 
ADD CONSTRAINT cost_primary_key
PRIMARY KEY (departure_station, arrival_station);		-- 복합 PRIMARY KEY : () 안의 내용 두가지를 하나의 기본키로 설정함

ALTER TABLE Cost
ADD CONSTRAINT cost_foreign_key_1
FOREIGN KEY (departure_station) 
REFERENCES Station (station_number);

ALTER TABLE Cost
ADD CONSTRAINT cost_foreign_key_2
FOREIGN KEY (arrival_station)
REFERENCES Station (station_number);

ALTER TABLE STOP_STATION
ADD CONSTRAINT stop_station_primary_key
PRIMARY KEY (station_number, train_number);

ALTER TABLE STOP_STATION
ADD CONSTRAINT stop_station_foreign_key_1
FOREIGN KEY (station_number)
REFERENCES STATION (station_number);

ALTER TABLE STOP_STATION
ADD CONSTRAINT stop_station_foreign_key_2
FOREIGN KEY (train_number)
REFERENCES TRAIN (train_number);

-- SEAT 와 TRAIN 연결은 3/30에 계속 ... 
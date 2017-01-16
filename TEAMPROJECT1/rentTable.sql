
-- 1. 고객 테이블
CREATE TABLE cusInfoTable ( 

	CusNum		NUMBER(10),		--고객ID
	CusName		VARCHAR2(100),	--이름
	MovieNum	NUMBER(10),		--영화No.
	CusTel		VARCHAR2(100)	--연락처

);

select * from cusInfoTable; 
DROP TABLE cusInfoTable; 

------------------------------------------

-- 2. 영화 테이블
CREATE TABLE movieTable ( 

	MovieNum	NUMBER(10),		--영화No.
	MovieName	VARCHAR2(1000),	--영화이름
	MoviePrice	NUMBER(10),		--영화가격
	MovieDate 	NUMBER(10)		--출시연도
	
);

select * from movieTable; 
DROP TABLE movieTable;  

------------------------------------------

insert into cusInfoTable 
values (201, '김토르', 10003, '010-5252-2525');

insert into cusInfoTable 
values (202, '이캡틴', 10004, '010-5925-2222');

insert into cusInfoTable 
values (203, '박헐크', 20001, '010-1234-1234');

------------------------------------------

insert into movieTable
values (20001, '너의 이름은', 3000, 2017);

insert into movieTable
values (20002, '마스터', 3000, 2017);

insert into movieTable
values (20003, '라라랜드', 2500, 2017);

insert into movieTable
values (10001, '이터널 선샤인', 1000, 2004);

insert into movieTable
values (10002, '수어사이드 스쿼드', 1000, 2014);

insert into movieTable
values (10003, '어벤져스1', 1500, 2012);

insert into movieTable
values (10004, '어벤져스2', 1500, 2015);


update MOVIETABLE
set movieName = '나의 이름은'
where movieName = '너의 이름은';

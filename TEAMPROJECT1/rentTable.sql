
-- 1. �� ���̺�
CREATE TABLE cusInfoTable ( 

	CusNum		NUMBER(10),		--��ID
	CusName		VARCHAR2(100),	--�̸�
	MovieNum	NUMBER(10),		--��ȭNo.
	CusTel		VARCHAR2(100)	--����ó

);

select * from cusInfoTable; 
DROP TABLE cusInfoTable; 

------------------------------------------

-- 2. ��ȭ ���̺�
CREATE TABLE movieTable ( 

	MovieNum	NUMBER(10),		--��ȭNo.
	MovieName	VARCHAR2(1000),	--��ȭ�̸�
	MoviePrice	NUMBER(10),		--��ȭ����
	MovieDate 	NUMBER(10)		--��ÿ���
	
);

select * from movieTable; 
DROP TABLE movieTable;  

------------------------------------------

insert into cusInfoTable 
values (201, '���丣', 10003, '010-5252-2525');

insert into cusInfoTable 
values (202, '��ĸƾ', 10004, '010-5925-2222');

insert into cusInfoTable 
values (203, '����ũ', 20001, '010-1234-1234');

------------------------------------------

insert into movieTable
values (20001, '���� �̸���', 3000, 2017);

insert into movieTable
values (20002, '������', 3000, 2017);

insert into movieTable
values (20003, '��󷣵�', 2500, 2017);

insert into movieTable
values (10001, '���ͳ� ������', 1000, 2004);

insert into movieTable
values (10002, '������̵� ������', 1000, 2014);

insert into movieTable
values (10003, '�����1', 1500, 2012);

insert into movieTable
values (10004, '�����2', 1500, 2015);


update MOVIETABLE
set movieName = '���� �̸���'
where movieName = '���� �̸���';

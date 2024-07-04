create table jul04_student(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_nickname varchar2(10 char) not null
);

create sequence jul04_student_seq;


select * from jul04_student;
-----------------------------------------------------------------------------------

create table jul04_testDate(
	t_subject varchar2(10 char) primary key,
	t_when date not null
);

drop table jul04_testDate cascade constraint purge;

create sequence jul04_testDate_seq;

select * from jul04_testDate;


 
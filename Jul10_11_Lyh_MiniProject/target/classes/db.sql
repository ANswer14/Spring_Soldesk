create table jul10_member(
	m_id varchar2(15 char) primary key,
	m_pw varchar2(15 char) not null,
	m_name varchar2(10 char) not null,
	m_birth date not null,
	m_photo varchar2(300 char) not null
);

drop table member cascade constraint purge;

select * from jul10_member;


 asdf 123    이영훈    1920-01-01 00:00:00.0 28658ea5e61.jpg




 answer qlalfqjsgh1! 이영훈    1920-01-01 00:00:00.0 4160758.png



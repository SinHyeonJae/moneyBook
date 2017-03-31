drop table if exists board;

create table if not exists board(
num int primary key auto_increment,
pass varchar(30),
name varchar(30),
email varchar(30),
title varchar(50),
content varchar(1000),
readcount  int,
writedate date
);

insert into board values (0,"1234","네오","neo@naver.com","아이린","예쁘다",0,now());
insert into board values (0,"0413","김영경","ykk_0413@naver.com","오늘머리","굉장히 추노이다",0,now());
insert into board values (0,"1111","제이지","jayG@kakao.com","신상이모티콘","제이지도있다 꺄올",0,now());

select * from board;
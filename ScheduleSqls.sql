create table test_table
(
	no int primary key,
	name varchar(100),
	age int 
);

select * from test_table;

insert into test_table values (1, 'name', 22);

/* auto_increment = 시퀀스처럼 자동증가 번호, 이게 있음 입력 안해도 자동으로 번호 매겨짐. 한번 지나간 번호는 초기화때까지 돌아오지 않음 */ 
create table schedule_theme
(
	theme_id int primary key auto_increment,
	theme_name varchar(50) default '새 테마',
	theme_font_light varchar(10) default '#000000',
	theme_font_heavy varchar(10) default '#000000',
	theme_back_light varchar(10) default '#FFFFFF',
	theme_back_heavy varchar(10) default '#FFFFFF',
	theme_border_light varchar(10) default '#000000',
	theme_border_heavy varchar(10) default '#000000',
	theme_days varchar(10) default '#FFFFFF',
	theme_calendar varchar(10) default '#FFFFFF'
);

drop table schedule_theme;

select * from schedule_theme;

insert into schedule_theme values();

insert into schedule_theme 
(theme_name, theme_font_light, theme_font_heavy, theme_back_light, theme_back_heavy, theme_border_light, theme_border_heavy, theme_days, theme_calendar) 
values ('기본 테마', '#808080', '#212121', '#808080', '#212121', '#808080', '#212121', '#FFFFFF', '#FFFFFF');
insert into schedule_theme 
(theme_name, theme_font_light, theme_font_heavy, theme_back_light, theme_back_heavy, theme_border_light, theme_border_heavy, theme_days, theme_calendar) 
values ('카카오톡', '#462929', '#FFEB01', '#462929', '#FFC601', '#462929', '#462929', '#FFEB01', '#FFFFFF');

delete from schedule_theme; where theme_id = 1;
/* 자동증가값 1 로 초기화 */
ALTER TABLE schedule_theme AUTO_INCREMENT = 1;
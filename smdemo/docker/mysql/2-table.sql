create table student(
    student_id int primary key auto_increment,
    student_name varchar(45) not null
);
create table teacher(
    teacher_id int primary key auto_increment,
    teacher_name varchar(45) not null
);
create table student_teacher(
    student_id int,
    teacher_id int,
    primary key(student_id,teacher_id)
);
insert into student(student_name) values("ougen");
insert into student(student_name) values("zhang");
insert into student(student_name) values("nana");
insert into student(student_name) values("guigui");
insert into student(student_name) values("qingqin");
insert into student(student_name) values("xixi");
insert into student(student_name) values("meme");
insert into student(student_name) values("lala");
insert into student(student_name) values("youyi");
insert into student(student_name) values("wawa");

insert into teacher(teacher_name) values("teach chegn");
insert into teacher(teacher_name) values("teach li");
insert into teacher(teacher_name) values("teach wang");
insert into teacher(teacher_name) values("teach zhang");
insert into teacher(teacher_name) values("teach ou");

insert into student_teacher(student_id,teacher_id) values(1,1);
insert into student_teacher(student_id,teacher_id) values(2,1);
insert into student_teacher(student_id,teacher_id) values(3,1);
insert into student_teacher(student_id,teacher_id) values(4,1);
insert into student_teacher(student_id,teacher_id) values(5,1);
insert into student_teacher(student_id,teacher_id) values(2,2);
insert into student_teacher(student_id,teacher_id) values(3,2);
insert into student_teacher(student_id,teacher_id) values(4,2);
insert into student_teacher(student_id,teacher_id) values(5,2);
insert into student_teacher(student_id,teacher_id) values(6,2);
insert into student_teacher(student_id,teacher_id) values(7,2);
insert into student_teacher(student_id,teacher_id) values(8,3);
insert into student_teacher(student_id,teacher_id) values(3,3);
insert into student_teacher(student_id,teacher_id) values(4,3);
insert into student_teacher(student_id,teacher_id) values(6,3);
insert into student_teacher(student_id,teacher_id) values(6,4);
insert into student_teacher(student_id,teacher_id) values(5,4);
insert into student_teacher(student_id,teacher_id) values(9,4);
insert into student_teacher(student_id,teacher_id) values(7,4);
insert into student_teacher(student_id,teacher_id) values(8,2);
insert into student_teacher(student_id,teacher_id) values(9,2);
insert into student_teacher(student_id,teacher_id) values(2,4);
insert into student_teacher(student_id,teacher_id) values(1,4);

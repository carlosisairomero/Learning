insert into course (id, name, created_date, updated_date)
values (10001, 'Course1', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into course (id, name, created_date, updated_date)
values (10002, 'Course2', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into course (id, name, created_date, updated_date)
values (10003, 'Course3', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into passport (id, number)
values (40001, 'C555555');
insert into passport (id, number)
values (40002, 'N444444');
insert into passport (id, number)
values (40003, 'T333333');

insert into student (id, name, passport_id)
values (20001, 'Carlos', 40001);
insert into student (id, name, passport_id)
values (20002, 'Nathalia', 40002);
insert into student (id, name, passport_id)
values (20003, 'Tati', 40003);

insert into review (id, rating, description, course_id)
values (50001, '5', 'Review 1', 10001);
insert into review (id, rating, description, course_id)
values (50002, '4', 'Review 2', 10001);
insert into review (id, rating, description, course_id)
values (50003, '3', 'Review 3', 10003);

insert into student_course(student_id, course_id)
values (20001, 10001);
insert into student_course(student_id, course_id)
values (20002, 10001);
insert into student_course(student_id, course_id)
values (20003, 10001);
insert into student_course(student_id, course_id)
values (20001, 10003);

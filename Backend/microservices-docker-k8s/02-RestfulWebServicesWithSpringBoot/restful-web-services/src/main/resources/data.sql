insert into user_details(id, birth_date, name)
values(10001, current_date(), 'Carlos');
insert into user_details(id, birth_date, name)
values(10002, current_date(), 'Isai');
insert into user_details(id, birth_date, name)
values(10003, current_date(), 'Romero');

insert into post(id, description, user_id)
values(20001, 'Decription 1', 10001);
insert into post(id, description, user_id)
values(20002, 'Decription 2', 10001);
insert into post(id, description, user_id)
values(20003, 'Decription 3', 10002);
insert into post(id, description, user_id)
values(20004, 'Decription 4', 10002);


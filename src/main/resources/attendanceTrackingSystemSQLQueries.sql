create database attendanceTrackingSystem;

use attendanceTrackingSystem;

show tables;

desc attendance;
desc batches;
desc notifications;
desc students;
desc subjects;
desc users;

alter table attendance 
add foreign key(frn_no) references students(frn_no),
modify column date varchar(225) not null;

alter table notifications
add foreign key(user_id) references users(user_id);

alter table students 
add foreign key(batch_id) references batches(batch_id);
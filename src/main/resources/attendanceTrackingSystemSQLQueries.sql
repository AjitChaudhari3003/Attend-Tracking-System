create database attendanceTrackingSystem;
drop database attendanceTrackingSystem;
use attendanceTrackingSystem;

show tables;
drop table batches;
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

INSERT INTO Users (user_id, name, email, password, role)
VALUES (1, 'Vinayak Ujalambe', 'vu@gmail.com', 'secret123', 'trainer'),
		(2, 'Shubham Wagh', 'sw@gmail.com', 'alicePwd', 'co-ordinator'),
		(3, 'Aadesh Tamgadge', 'at@gmail.com', 'bobPwd', 'trainer'),
		(4, 'Sanjana Satdive', 'ss@gmail.com.com', 'carolPwd', 'co-ordinator'),
        (5, 'ranjeet kamble', 'ranjeet.kamble@example.com', 'rk123', 'trainer'),
		  (6, 'ranjit kale',   'ranjit.kale@example.com',   'ranjit123', 'trainer'),
		  (7, 'chetan natu',   'chetan.natu@example.com',   'natu234', 'trainer'),
		  (8, 'vaishali reddy','vaishali.reddy@example.com','vr123', 'co-ordinator'),
		  (9, 'sonal jaju',    'sonal.jaju@example.com',    'pass345', 'co-ordinator'),
		  (10, 'iskra daware',  'iskra.daware@example.com',  'id12345', 'co-ordinator');

select * from users;

INSERT INTO Batches (batch_id, batch_name, start_time, end_time)
VALUES
  (1, 'java full stack july 2024 offline', '09:00:00', '17:00:00'),
  (2, 'java full stack july 2024 online',  '18:00:00', '20:00:00'),
  (3, 'python full stack july 2024 offline', '09:00:00', '17:00:00'),
  (4, 'python full stack july 2024 online',  '18:00:00', '20:00:00'),
  (5, 'java full stack october 2024 offline', '09:00:00', '17:00:00'),
  (6, 'java full stack october 2024 online',  '18:00:00', '20:00:00'),
  (7, 'python full stack october 2024 offline', '09:00:00', '17:00:00'),
  (8, 'python full stack october 2024 online',  '18:00:00', '20:00:00'),
  (9,  'java full stack january 2025 offline', '09:00:00', '17:00:00'),
  (10, 'java full stack january 2025 online',  '18:00:00', '20:00:00'),
  (11, 'python full stack january 2025 offline', '09:00:00', '17:00:00'),
  (12, 'python full stack january 2025 online',  '18:00:00', '20:00:00');

select * from batches
insert into students (frn_no, batch_id,
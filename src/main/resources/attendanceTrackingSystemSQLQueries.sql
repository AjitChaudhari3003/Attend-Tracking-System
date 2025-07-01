create database attendanceTrackingSystem;
use attendanceTrackingSystem;

show tables;
table subjects;
table batches;
table users;
table students;

desc users;
desc batches;
desc students;
desc subjects;
desc attendance;
desc notifications;

alter table attendance 
add foreign key(frn_no) references students(frn_no),
modify column date varchar(225) not null;

alter table notifications
add foreign key(user_id) references users(user_id);

alter table students 
add foreign key(batch_id) references batches(batch_id);

HEAD
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

<<<<<<< HEAD
select * from batches;

INSERT INTO subjects (subject_id, subject_name)
VALUES
  (1, 'c'),
  (2, 'c++'),
  (3, 'java'),
  (4, 'python'),
  (5, 'html'),
  (6, 'css'),
  (7, 'c#'),
  (8, 'sql');
  
select * from subjects;

INSERT INTO Students (frn_no, name, email, batch_id, is_active)
VALUES
  (' FRN-12J0923/059', 'Chetan Laxman Patil', 'ranjeet.kamble@example.com',    1,  TRUE),
  ('FRN-12J0923/080', 'Komal Anant Gundla', 'ranjit.kale@example.com',      2,  TRUE),
  ('FRN-12J0923/112', ' Namrata Vijay Kherde', 'chetan.natu@example.com',      3,  TRUE),
  (' FRN-12J0923/113', 'Rani Mohan Jadhav', 'vaishali.reddy@example.com',   4,  TRUE),
  (' FRN-12J0923/114', 'Divya Satish More',        'sonal.jaju@example.com',       5,  TRUE),
  (' FRN-12J0923/116', 'Ajit Gangavane',      'iskra.daware@example.com',     6,  TRUE),
  (' FRN-12J0923/117', 'Khairnar Swamini jyotish', 'john.smith@example.com',       7,  TRUE),
  (' FRN-12J0923/118', 'Neha Sagar Bansod',          'jane.doe@example.com',         8,  FALSE),
  ('FRN-12J0923/119', 'Vishal Santosh kumbhar',     'alice.johnson@example.com',    9,  TRUE),
  ('FRN-12J0923/120', 'Ashwini Raju Gawari',      'bob.williams@example.com',     10, TRUE),
  ('FRN-12J0923/121', 'Satish yadav',     'charlie.brown@example.com',    11, FALSE),
  ('FRN-12J0923/122', 'Jayesh Vijay Patil',        'diana.ross@example.com',       12, TRUE);

-- insert into students (frn_no, batch_id,
=======
select * from batches
insert into students (frn_no, batch_id,

insert into users (user_id, name, email, password, role) values
(1, 'Aadesh Tamgadge', 'aadesh@gmail.com', 'aadesh123', 'co-ordinator'), 
(2, 'Chetan Natu', 'chetan@gmail.com', 'chetan123', 'trainer'), 
(3, 'Shubham Wagh', 'shubham@gmail.com', 'shubham123', 'trainer'), 
(4, 'Ranjit Kale', 'ranjit@gmail.com', 'ranjit123', 'co-ordinator'), 
(5, 'Vinayak Ujalambe', 'vinayak@gmail.com', 'vinayak123', 'trainer'), 
(6, 'Sonal Jaju', 'sonal@gmail.com', 'sonal123', 'trainer');

65e8ecf (Done)
>>>>>>> d06174b4b28f55519e5825eeabdf0ba910095486

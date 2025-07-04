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

TRUNCATE TABLE subjects;

INSERT INTO subjects (subject_id, subject_name, trainer_id, batch_id)
VALUES
  (1, 'C',       1, 1),
  (2, 'C++',     1, 1),
  (3, 'Java',    3, 2),
  (4, 'Python',  3, 3),
  (5, 'HTML',    5, 4),
  (6, 'CSS',     5, 4),
  (7, 'C#',      6, 5),
  (8, 'SQL',     6, 5);

SELECT * FROM subjects WHERE trainer_id IS NOT NULL AND batch_id IS NOT NULL;

SELECT * FROM subjects WHERE trainer_id = 1;

-- Sample: Assigning trainer_id to existing batches
UPDATE batches SET trainer_id = 1 WHERE batch_id = 1;
UPDATE batches SET trainer_id = 3 WHERE batch_id = 2;
UPDATE batches SET trainer_id = 5 WHERE batch_id = 3;
UPDATE batches SET trainer_id = 6 WHERE batch_id = 4;
UPDATE batches SET trainer_id = 7 WHERE batch_id = 5;
UPDATE batches SET trainer_id = 1 WHERE batch_id = 6;
UPDATE batches SET trainer_id = 3 WHERE batch_id = 7;
UPDATE batches SET trainer_id = 5 WHERE batch_id = 8;
UPDATE batches SET trainer_id = 6 WHERE batch_id = 9;
UPDATE batches SET trainer_id = 7 WHERE batch_id = 10;
UPDATE batches SET trainer_id = 1 WHERE batch_id = 11;
UPDATE batches SET trainer_id = 3 WHERE batch_id = 12;

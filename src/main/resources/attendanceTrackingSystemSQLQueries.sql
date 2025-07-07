create database attendanceTrackingSystem;
drop schema attendanceTrackingSystem;
use attendanceTrackingSystem;
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

INSERT INTO batches (batch_id, batch_name, start_date, end_date)
VALUES
  (1, 'java full stack july 2024 offline', '2024-07-01', '2024-12-31'),
  (2, 'java full stack july 2024 online',  '2024-07-01', '2024-12-31'),
  (3, 'python full stack july 2024 offline', '2024-07-01', '2024-12-31'),
  (4, 'python full stack july 2024 online',  '2024-07-01', '2024-12-31'),
  (5, 'java full stack october 2024 offline', '2024-10-01', '2025-03-31'),
  (6, 'java full stack october 2024 online',  '2024-10-01', '2025-03-31'),
  (7, 'python full stack october 2024 offline', '2024-10-01', '2025-03-31'),
  (8, 'python full stack october 2024 online',  '2024-10-01', '2025-03-31'),
  (9,  'java full stack january 2025 offline', '2025-01-01', '2025-06-30'),
  (10, 'java full stack january 2025 online',  '2025-01-01', '2025-06-30'),
  (11, 'python full stack january 2025 offline', '2025-01-01', '2025-06-30'),
  (12, 'python full stack january 2025 online',  '2025-01-01', '2025-06-30');

select * from batches;

INSERT INTO subjects (subject_id, subject_name, start_time, end_time)
VALUES
  (1, 'C', '09:00:00', '10:00:00'),
  (2, 'C++', '10:00:00', '11:00:00'),
  (3, 'Java', '11:00:00', '12:00:00'),
  (4, 'Python', '12:00:00', '13:00:00'),
  (5, 'HTML', '14:00:00', '15:00:00'),
  (6, 'CSS', '15:00:00', '16:00:00'),
  (7, 'C#', '16:00:00', '17:00:00'),
  (8, 'SQL', '17:00:00', '18:00:00');

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


INSERT INTO subjects (subject_name, start_time, end_time)
VALUES
  ('C',     '09:00:00', '10:00:00'),
  ('C++',   '10:00:00', '11:00:00'),
  ('Java',  '11:00:00', '12:00:00'),
  ('Python','12:00:00', '13:00:00'),
  ('HTML',  '14:00:00', '15:00:00'),
  ('CSS',   '15:00:00', '16:00:00'),
  ('C#',    '16:00:00', '17:00:00'),
  ('SQL',   '17:00:00', '18:00:00'),
  ('Java',  '11:00:00', '12:00:00'),
  ('Python','12:00:00', '13:00:00'),
  ('SQL',   '17:00:00', '18:00:00'),
  ('HTML',  '14:00:00', '15:00:00');



INSERT INTO trainer_subject_batch (id, trainer_id, subject_id, batch_id)
VALUES
  (1, 5,  1,  1),
  (2, 6,  2,  2),
  (3, 7,  3,  3),
  (4, 1,  4,  4),
  (5, 3,  5,  5),
  (6, 5,  6,  6),
  (7, 6,  7,  7),
  (8, 7,  8,  8),
  (9, 1,  9,  9),
  (10,3, 10, 10),
  (11,5, 11, 11),
  (12,6, 12, 12);


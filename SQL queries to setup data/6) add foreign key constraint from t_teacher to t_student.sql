ALTER TABLE t_student 
ADD CONSTRAINT fk_student_teacher FOREIGN KEY 
(teacher_id) REFERENCES t_teacher (teacher_id)
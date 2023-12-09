package ru.stud.sudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stud.sudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);

    Student findStudentByEmail(String email);
}

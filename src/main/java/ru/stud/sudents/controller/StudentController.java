package ru.stud.sudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.stud.sudents.model.Student;
import ru.stud.sudents.service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping("/save-student")
    Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping
    Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
}

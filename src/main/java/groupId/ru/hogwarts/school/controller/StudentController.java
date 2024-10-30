package groupId.ru.hogwarts.school.controller;

import groupId.ru.hogwarts.school.model.Student;
import groupId.ru.hogwarts.school.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/student")

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

@GetMapping("{id}")
    public ResponseEntity< Student> findStudents(@PathVariable long id) {
Student student = studentService.findStudent(id);
if(student == null) {
    return ResponseEntity.notFound().build();
}
return ResponseEntity.ok(student); //ок - ок вызвать студента
    }


@PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }


    public ResponseEntity<Student> editStudent(@PathVariable long id,@RequestBody Student student) {
Student studentEdit=studentService.editStudent(id, student);
if (studentEdit == null) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); //build - строить
}
return ResponseEntity.ok(studentEdit);

    }

    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
studentService.deleteStudent(id);
return ResponseEntity.ok().build();
    }

}

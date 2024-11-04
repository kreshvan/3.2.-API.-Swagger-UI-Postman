package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.model.Student;

public interface StudentService {
    Student addStudent(Student student);

    Student findStudent(long id);

    void editStudent( Student student);

    void deleteStudent(long id);
}

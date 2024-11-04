package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.exepcion.StudentNotFoundException;
import groupId.ru.hogwarts.school.model.Student;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

@Service

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
public Student addStudent(Student student) {
 //put-поместить
    return studentRepository.save(student);
}


@Override
public Student findStudent(long id) {

        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
}

@Override
public void editStudent( Student student) {
   studentRepository.save(student);

}
@Override
public void deleteStudent(long id) {
       Student student = studentRepository.findById(id)
                 .orElseThrow(() ->new StudentNotFoundException(id));
studentRepository.deleteById(student.getId());
}





}

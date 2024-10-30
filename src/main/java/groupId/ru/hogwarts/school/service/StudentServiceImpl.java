package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.model.Faculty;
import groupId.ru.hogwarts.school.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service

public class StudentServiceImpl implements StudentService {

    HashMap<Long,Student> students = new HashMap<>();
   private long count = 0;

@Override
public Student addStudent(Student student) {
  student.setId(++count);
  students.put(student.getId(), student); //put-поместить
    return student;
}


@Override
public Student findStudent(long id) {
return students.get(id);
}

@Override
public Student editStudent(long id, Student student) {
    if (!students.containsKey(id)) { //если у значения id нет объекта студент значит null

return null;
    }
    students.put(id, student);
    return student;

}
@Override
public void deleteStudent(long id) {
   students.remove(id);
}





}

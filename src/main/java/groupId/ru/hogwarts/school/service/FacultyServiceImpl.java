package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class FacultyServiceImpl implements FacultyService {

   private final HashMap<Long,Faculty> faculties = new HashMap<>();
   private long count = 0;

   @Override
   public Faculty addFaculty(Faculty faculty) {
faculty.setId(++count);
faculties.put(faculty.getId(), faculty);//тут добавляем HashMap<Long,Faculty> (ключ и сам объект)
   return faculty;
   }

   @Override
   public Faculty findFaculty(long id) {
       return faculties.get(id);
   }
   @Override
   public Faculty editFaculty(Long id, Faculty faculty) {
     if (!faculties.containsKey(id)) {
         return null;
     }
     faculties.put(id, faculty);
     return faculty;
   }
@Override
public void deleteFaculty(long id) {
       faculties.remove(id);
}



}

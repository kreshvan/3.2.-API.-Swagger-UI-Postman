package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.model.Faculty;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    Faculty editFaculty(Long id, Faculty faculty);

    void deleteFaculty(long id);
}

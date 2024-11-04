package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.model.Faculty;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import repository.FacultyRepository;

@Service

public class FacultyServiceImpl implements FacultyService {


    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).orElseThrow(()->new NotFoundException(Faculty.class.getName()));
    }

    @Override
    public Faculty editFaculty(Long id, Faculty faculty) {

        return facultyRepository.save(faculty);
    }

    @Override
    public void deleteFaculty(long id) {
        Faculty faculty = facultyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Faculty not found"));
        facultyRepository.deleteById(faculty.getId());
    }


}

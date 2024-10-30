package groupId.ru.hogwarts.school.controller;



import groupId.ru.hogwarts.school.model.Faculty;
import groupId.ru.hogwarts.school.service.FacultyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }




    @GetMapping("{id}")
    public ResponseEntity<Faculty> getFaculty(@PathVariable long id) {
        Faculty faculty = facultyService.findFaculty(id);
        if (getFaculty(id) == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(faculty);

    }
@PostMapping
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        return facultyService.addFaculty(faculty);


    }
    @PutMapping
    public ResponseEntity<Faculty> editFaculty(@PathVariable long id, @RequestBody Faculty faculty) {
        Faculty foundFaculty = facultyService.editFaculty(id,faculty);
        if (foundFaculty == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }


        return ResponseEntity.ok(foundFaculty);
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteDelete(@PathVariable long id) {
         facultyService.deleteFaculty(id);
         return ResponseEntity.ok().build();

    }

}

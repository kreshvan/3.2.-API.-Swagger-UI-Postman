package repository;

import groupId.ru.hogwarts.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

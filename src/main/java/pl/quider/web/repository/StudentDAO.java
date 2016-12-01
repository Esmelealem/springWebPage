package pl.quider.web.repository;

import org.springframework.data.repository.CrudRepository;
import pl.quider.web.model.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {
}

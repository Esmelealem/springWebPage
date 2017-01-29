package pl.quider.web.repository;


import org.springframework.data.repository.CrudRepository;
import pl.quider.web.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {
}

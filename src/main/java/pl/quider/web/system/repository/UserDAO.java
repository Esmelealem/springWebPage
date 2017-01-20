package pl.quider.web.system.repository;


import org.springframework.data.repository.CrudRepository;
import pl.quider.web.system.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {
}

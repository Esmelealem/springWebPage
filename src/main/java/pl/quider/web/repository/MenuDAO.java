package pl.quider.web.repository;


import org.springframework.data.repository.CrudRepository;
import pl.quider.web.model.Menu;

public interface MenuDAO extends CrudRepository<Menu, Integer> {
}

package pl.quider.web.system.repository;


import org.springframework.data.repository.CrudRepository;
import pl.quider.web.system.model.Menu;

public interface MenuDAO extends CrudRepository<Menu, Integer> {
}

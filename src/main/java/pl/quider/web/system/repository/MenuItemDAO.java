package pl.quider.web.system.repository;


import org.springframework.data.repository.CrudRepository;
import pl.quider.web.system.model.MenuItem;

public interface MenuItemDAO extends CrudRepository<MenuItem, Integer> {
}

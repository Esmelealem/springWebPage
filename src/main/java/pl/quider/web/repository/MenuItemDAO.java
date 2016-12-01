package pl.quider.web.repository;


import org.springframework.data.repository.CrudRepository;
import pl.quider.web.model.MenuItem;

public interface MenuItemDAO extends CrudRepository<MenuItem, Integer> {
}

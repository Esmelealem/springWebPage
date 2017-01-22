package pl.quider.web.accounting.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quider.web.accounting.model.Item;

/**
 * Created by Adrian on 22.01.2017.
 */
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
}

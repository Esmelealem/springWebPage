package pl.quider.web.accounting.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quider.web.accounting.model.Item;
import pl.quider.web.accounting.model.Unit;

@Repository
public interface UnitDao extends CrudRepository<Unit, Integer> {
}

package pl.quider.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quider.web.model.Unit;

@Repository
public interface UnitDao extends CrudRepository<Unit, Integer> {
}

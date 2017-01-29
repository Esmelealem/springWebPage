package pl.quider.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quider.web.model.Country;

/**
 * Created by Adrian on 29.01.2017.
 */
@Repository
public interface CountryDao extends CrudRepository<Country,Integer> {
}

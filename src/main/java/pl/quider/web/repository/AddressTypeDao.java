package pl.quider.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quider.web.model.AddressType;

/**
 * Created by Adrian on 22.01.2017.
 */
@Repository
public interface AddressTypeDao extends CrudRepository<AddressType, Integer> {
}

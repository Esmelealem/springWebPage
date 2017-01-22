package pl.quider.web.contact.repository;

import org.springframework.data.repository.CrudRepository;
import pl.quider.web.contact.model.AddressType;

import java.io.Serializable;

/**
 * Created by Adrian on 22.01.2017.
 */
public interface AddressTypeDao<AddressType, Integer extends Serializable> extends CrudRepository<AddressType, Integer> {
}

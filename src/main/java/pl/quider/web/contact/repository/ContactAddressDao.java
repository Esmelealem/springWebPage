package pl.quider.web.contact.repository;

import org.springframework.data.repository.CrudRepository;
import pl.quider.web.contact.model.ContactAddress;

/**
 * Created by Adrian on 22.01.2017.
 */
public interface ContactAddressDao extends CrudRepository<ContactAddress, Integer> {
}

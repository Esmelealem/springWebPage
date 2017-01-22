package pl.quider.web.contact.repository;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Adrian on 22.01.2017.
 */
@Repository
public interface ContactDao<Contact, Integer extends Serializable> extends CrudRepository<Contact, Integer> {

//    @Query("from Auction a join a.category c where c.name=:categoryName")
//    public Iterable<Contact> findByCategory(@Param("categoryName") String categoryName);
}

package pl.quider.web.repository;

//import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quider.web.model.Contact;

//import org.springframework.data.repository.query.Param;

@Repository
public interface ContactDao extends CrudRepository<Contact, Integer> {

//    @Query("from Auction a join a.category c where c.name=:categoryName")
//    public Iterable<Contact> findByCategory(@Param("categoryName") String categoryName);
}

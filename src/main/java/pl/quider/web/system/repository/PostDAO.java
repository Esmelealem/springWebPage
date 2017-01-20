package pl.quider.web.system.repository;

import org.springframework.data.repository.CrudRepository;
import pl.quider.web.system.model.Post;

public interface PostDAO extends CrudRepository<Post, Integer> {

}

package pl.quider.web.repository;

import org.springframework.data.repository.CrudRepository;
import pl.quider.web.model.Post;

public interface PostDAO extends CrudRepository<Post, Integer> {

}

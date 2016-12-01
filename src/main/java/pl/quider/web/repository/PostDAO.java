package pl.quider.web.repository;

import org.springframework.data.repository.CrudRepository;
import pl.quider.web.model.Post;

import java.util.Collection;

public interface PostDAO extends CrudRepository<Post, Integer> {

}

package at.ccp19.repository;

import at.ccp19.entity.Book;
import at.ccp19.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}

package za.co.bogote.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import za.co.bogote.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

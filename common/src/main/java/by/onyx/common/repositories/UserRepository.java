package by.onyx.common.repositories;

import by.onyx.common.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}

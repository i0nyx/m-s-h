package by.onyx.common.repositories;

import by.onyx.common.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepositories extends JpaRepository<User, Integer> {
}

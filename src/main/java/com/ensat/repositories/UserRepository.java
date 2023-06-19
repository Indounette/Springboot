package com.ensat.repositories;
import com.ensat.entities.User;
import org.springframework.data.jpa.repository.*;
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
    User findByPassword(String password);
}
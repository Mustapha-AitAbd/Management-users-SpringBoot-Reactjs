package com.mustapha.fullstuckapp.repository;
import com.mustapha.fullstuckapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

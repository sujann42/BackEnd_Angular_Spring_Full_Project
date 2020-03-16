package com.crud.Angular_Spring_Full_Project.dao;

import com.crud.Angular_Spring_Full_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

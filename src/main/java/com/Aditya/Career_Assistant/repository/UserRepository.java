package com.Aditya.Career_Assistant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Aditya.Career_Assistant.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}

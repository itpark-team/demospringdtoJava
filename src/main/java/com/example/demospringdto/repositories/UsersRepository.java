package com.example.demospringdto.repositories;

import com.example.demospringdto.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
}

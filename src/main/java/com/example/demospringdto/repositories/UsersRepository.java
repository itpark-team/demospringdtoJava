package com.example.demospringdto.repositories;

import com.example.demospringdto.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from users where id_country = ?1",nativeQuery = true)
    List<User> findByIdCountry(Integer idCountry);
}

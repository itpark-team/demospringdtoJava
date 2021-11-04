package com.example.demospringdto.repositories;

import com.example.demospringdto.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Country, Integer> {
}

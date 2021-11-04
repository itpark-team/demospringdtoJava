package com.example.demospringdto.dtos;

import com.example.demospringdto.models.User;
import lombok.Data;

import java.util.Set;

@Data
public class CountryDto {
    public int id;
    public String name;
    public Set<User> users;
}

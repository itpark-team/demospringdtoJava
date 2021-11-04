package com.example.demospringdto.dtos;

import com.example.demospringdto.models.User;
import lombok.Data;

import java.util.List;

@Data
public class CountryDto {
    public int id;
    public String name;
    public List<UserDto> users;
}

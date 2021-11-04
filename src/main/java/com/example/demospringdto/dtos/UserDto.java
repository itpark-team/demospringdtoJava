package com.example.demospringdto.dtos;

import lombok.Data;

@Data
public class UserDto {
    public int id;
    public String name;
    public double rating;
    //public String country_name;
    public String countryName;
}

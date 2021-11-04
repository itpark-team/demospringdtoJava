package com.example.demospringdto.controllers;

import com.example.demospringdto.dtos.CountryDto;
import com.example.demospringdto.dtos.UserDto;
import com.example.demospringdto.services.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/countries", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CountriesController {

    @Autowired
    private final CountriesService countriesService;

    public CountriesController(CountriesService countriesService) {
        this.countriesService = countriesService;
    }

    @GetMapping(value = "/getAll")
    public List<CountryDto> getAll() throws Exception {
        return countriesService.getAll();
    }
}

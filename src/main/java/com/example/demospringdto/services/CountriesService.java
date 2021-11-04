package com.example.demospringdto.services;

import com.example.demospringdto.repositories.CountriesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {
    @Autowired
    private final CountriesRepository countriesRepository;

    @Autowired
    private ModelMapper modelMapper;

    public CountriesService(CountriesRepository countriesRepository, ModelMapper modelMapper) {
        this.countriesRepository = countriesRepository;
        this.modelMapper = modelMapper;
    }
}

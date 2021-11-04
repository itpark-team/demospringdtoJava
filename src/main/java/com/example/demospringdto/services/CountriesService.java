package com.example.demospringdto.services;

import com.example.demospringdto.dtos.CountryDto;
import com.example.demospringdto.dtos.UserDto;
import com.example.demospringdto.models.Country;
import com.example.demospringdto.models.User;
import com.example.demospringdto.repositories.CountriesRepository;
import com.example.demospringdto.repositories.UsersRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountriesService {
    @Autowired
    private final CountriesRepository countriesRepository;

    @Autowired
    private final UsersRepository usersRepository;

    @Autowired
    private ModelMapper modelMapper;

    public CountriesService(CountriesRepository countriesRepository, UsersRepository usersRepository, ModelMapper modelMapper) {
        this.countriesRepository = countriesRepository;
        this.usersRepository = usersRepository;
        this.modelMapper = modelMapper;
    }

    public List<CountryDto> getAll() {

        List<CountryDto> countryDtos = countriesRepository.findAll().stream().
                map(country -> modelMapper.map(country, CountryDto.class))
                .collect(Collectors.toList());

        for (CountryDto countryDto: countryDtos) {
            List<User> findUsers = usersRepository.findByIdCountry(countryDto.id);

            List<UserDto> findUserDtos = findUsers.stream().
                    map(user -> modelMapper.map(user, UserDto.class))
                    .collect(Collectors.toList());

            countryDto.setUsers(findUserDtos);
        }

        return countryDtos;
    }
}

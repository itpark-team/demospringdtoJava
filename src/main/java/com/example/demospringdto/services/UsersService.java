package com.example.demospringdto.services;

import com.example.demospringdto.dtos.UserDto;
import com.example.demospringdto.models.User;
import com.example.demospringdto.repositories.UsersRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersService {
    @Autowired
    private final UsersRepository usersRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UsersService(UsersRepository usersRepository, ModelMapper modelMapper) {
        this.usersRepository = usersRepository;
        this.modelMapper = modelMapper;
    }

    public List<UserDto> getAll() {

        //ручная настрока маппинга

        /*
        PropertyMap<User, UserDto> userMap = new PropertyMap<User, UserDto>() {
            protected void configure() {
                map(source.country.getName(), destination.country_name);
            }

        };

        modelMapper.addMappings(userMap);
        */


        return usersRepository.findAll().stream().
                map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }
}

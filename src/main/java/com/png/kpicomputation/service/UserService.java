package com.png.kpicomputation.service;


import com.png.kpicomputation.dto.UserDto;
import com.png.kpicomputation.model.User;
import com.png.kpicomputation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import static java.util.stream.Collectors.toList;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<UserDto> getUserLastName(String name){

        List<User> userList = userRepository.findByLastName(name);

        List<UserDto> userDtos = userList.stream()
                .map(UserDto::new)
                .collect(toList());

        return userDtos;


    }
}

package com.java.spring_crud.service;

import com.java.spring_crud.dto.UsersDto;
import com.java.spring_crud.exception.ValidationException;


import java.util.List;

public interface UsersService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();

}

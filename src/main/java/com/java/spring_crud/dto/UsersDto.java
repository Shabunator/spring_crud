package com.java.spring_crud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * В этот класс мы будем превращать нашу сущность USER, когда достанем данные из базы.
 * Также этот класс будет служить трансформером между клиентом, контроллером и сервисом.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {

    private Integer id;
    private String name;
    private String login;
    private String email;
}

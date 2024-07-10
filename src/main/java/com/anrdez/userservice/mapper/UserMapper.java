package com.anrdez.userservice.mapper;

import com.anrdez.userservice.model.dto.UserDto;
import com.anrdez.userservice.model.entity.User;

public class UserMapper {

    public static UserDto entityToDto(User entity){

        return UserDto.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .build();
    }


    public static User dtoToEntity(UserDto dto){
        
        return User.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
    }

}

package com.crud.apirest.apirestful.dto;

import com.crud.apirest.apirestful.model.Role;
import lombok.Data;

@Data
public class UserDto {
    private String username;
    private String password;
    private Role role;
}

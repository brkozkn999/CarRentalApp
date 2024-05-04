package com.berksprojects.carrental.dto;

import com.berksprojects.carrental.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
}

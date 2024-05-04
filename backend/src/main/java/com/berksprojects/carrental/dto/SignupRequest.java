package com.berksprojects.carrental.dto;

import com.berksprojects.carrental.enums.UserRole;
import lombok.Data;

@Data
public class SignupRequest {
    private String name;
    private String email;
    private String password;
    private UserRole userRole;
}

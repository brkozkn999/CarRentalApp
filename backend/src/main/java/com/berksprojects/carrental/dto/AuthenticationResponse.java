package com.berksprojects.carrental.dto;

import com.berksprojects.carrental.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
    private UserRole userRole;
    private Long userId;
}

package com.berksprojects.carrental.services.auth;

import com.berksprojects.carrental.dto.SignupRequest;
import com.berksprojects.carrental.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);
    boolean hasCustomerWithEmail(String email);
}

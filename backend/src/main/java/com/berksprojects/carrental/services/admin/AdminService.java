package com.berksprojects.carrental.services.admin;

import com.berksprojects.carrental.dto.CarDto;

import java.io.IOException;

public interface AdminService {
    boolean postCar(CarDto carDto) throws IOException;
}

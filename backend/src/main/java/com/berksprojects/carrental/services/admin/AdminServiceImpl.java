package com.berksprojects.carrental.services.admin;

import com.berksprojects.carrental.dto.CarDto;
import com.berksprojects.carrental.entity.Car;
import com.berksprojects.carrental.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final CarRepository carRepository;

    @Override
    public boolean postCar(CarDto carDto) throws IOException {
        try {
            Car car = new Car();
            car.setId(carDto.getId());
            car.setBrand(carDto.getBrand());
            car.setColor(carDto.getColor());
            car.setName(carDto.getName());
            car.setType(carDto.getType());
            car.setTransmission(carDto.getTransmission());
            car.setDescription(carDto.getDescription());
            car.setPrice(carDto.getPrice());
            car.setYear(carDto.getYear());
            car.setImage(carDto.getImage().getBytes());
            carRepository.save(car);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}

package Validator.Register;

import Domain.Car;
import exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterResponse checkCar(Car car) throws CityRegisterException;
}

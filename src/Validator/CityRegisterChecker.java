package Validator;

import Domain.Car;
import Domain.CityRegisterCheckerResponse;
import exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkCar(Car car) throws CityRegisterException;
}

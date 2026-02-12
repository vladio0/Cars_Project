package Validator.Register;

import Domain.Car;
import exception.CityRegisterException;
import exception.TransportException;

public interface CityRegisterChecker {
    CityRegisterResponse checkCar(Car car) throws CityRegisterException, TransportException;
}

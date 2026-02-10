package Validator;

import Domain.Car;
import Domain.CityRegisterCheckerResponse;
import exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterCheckerResponse checkCar(Car car) throws CityRegisterException{

        return null;
    }
}

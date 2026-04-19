package validator;

import domain.deal.Car;
import exception.CityRegisterResponse;
import domain.deal.Person;
import exception.CityRegisterException;
import exception.TransportException;

public class RealCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException {

        return null;
    }

    public CityRegisterResponse checkCar(Car brand)
            throws CityRegisterException, TransportException {
        return null;
    }
}

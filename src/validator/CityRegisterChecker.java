package validator;

import domain.deal.Car;
import exception.CityRegisterResponse;
import domain.deal.Person;
import exception.CityRegisterException;
import exception.TransportException;

public interface CityRegisterChecker {
    CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException;
    CityRegisterResponse checkCar(Car brand) throws CityRegisterException, TransportException;

}

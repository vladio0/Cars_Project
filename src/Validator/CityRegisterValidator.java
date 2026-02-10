package Validator;

import Answer.AnswerCityRegister;
import Domain.Car;
import Domain.CarOrder;
import Domain.CityRegisterCheckerResponse;
import exception.CityRegisterException;

public class CityRegisterValidator {
    public static String hostName;
    protected int port;
    private static String login;
    String password;

    private CityRegisterChecker carChecker;

    public CityRegisterValidator() {
        carChecker = new RealCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(CarOrder car1){
        try {
            CityRegisterCheckerResponse seatsAns = carChecker.checkCar(car1.getSeats());
            CityRegisterCheckerResponse bodyAns = carChecker.checkCar(car1.getBodyType());
            CityRegisterCheckerResponse fuelAns = carChecker.checkCar(car1.getFuelType());
        }
        catch(CityRegisterException ex){
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();

        return ans;
    }

}

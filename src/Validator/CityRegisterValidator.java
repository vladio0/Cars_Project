package Validator;

import Answer.AnswerCityRegister;
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
        carChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(CarOrder car1){
        try {
            CityRegisterCheckerResponse passengerAns = carChecker.checkCar(car1.getPassenger());
            CityRegisterCheckerResponse truckAns = carChecker.checkCar(car1.getElectro());
            CityRegisterCheckerResponse electricAns = carChecker.checkCar(car1.getTruck());
        }
        catch(CityRegisterException ex){
            ex.printStackTrace(System.out);

        }

        AnswerCityRegister ans = new AnswerCityRegister();

        return ans;
    }

}

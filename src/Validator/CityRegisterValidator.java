package Validator;

import Answer.AnswerCityRegister;
import Domain.CarOrder;

public class CityRegisterValidator {
    public static String hostName;
    public static String login;
    public static String password;
    public static AnswerCityRegister checkCityRegister(CarOrder car1){



        System.out.println("City of register checked successful! " + hostName + ", "+ login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;

        return ans;
    }

}

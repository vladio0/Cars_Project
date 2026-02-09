package Domain;

import Answer.AnswerCityRegister;
import Answer.AnswerInsurance;
import Answer.AnswerMark;
import Answer.AnswerMileage;
import Validator.CarInsuranceValidator;
import Validator.CarMarkValidator;
import Validator.CarMileageValidator;
import Validator.CityRegisterValidator;
import mail.MailSender;


public class CarOrderValidator {

    private CityRegisterValidator cityRegVal;
    private CarMarkValidator markVal;
    private CarInsuranceValidator insVal;
    private CarMileageValidator milVal;
    private MailSender mailSender;

    public CarOrderValidator(){
        cityRegVal = new CityRegisterValidator();
        markVal = new CarMarkValidator();
        insVal = new CarInsuranceValidator();
        milVal = new CarMileageValidator();
        mailSender = new MailSender();
    }

    public static void main (String [] args){
        CarOrderValidator cov = new CarOrderValidator();
        cov.checkAll();
    }

    public void checkAll() {
        CarOrder car1 = readCarOrder();

        AnswerMark markAnswer = checkCarMark(car1);
        AnswerCityRegister cityAnswer = checkCityRegister(car1);
        AnswerInsurance insuranceAnswer = checkCarInsurance(car1);
        AnswerMileage mileageAnswer = checkCarMileage(car1);

        sendMail(car1);

        car1 = readCarOrder();
    }

    public CarOrder readCarOrder(){
        CarOrder car1 = new CarOrder();
        return car1;
    }

    public AnswerMark checkCarMark(CarOrder car1){

        CarMarkValidator cmv1 = new CarMarkValidator();
        return markVal.checkCarMark(car1);
    }

    public AnswerCityRegister checkCityRegister(CarOrder car1){
        return cityRegVal.checkCityRegister(car1);
    }

    public AnswerInsurance checkCarInsurance(CarOrder car1){
        CarInsuranceValidator iv1 = new CarInsuranceValidator();
        return insVal.checkCarInsurance(car1);
    }

    public AnswerMileage checkCarMileage(CarOrder car1){
        CarMileageValidator cmv1 = new CarMileageValidator();
        return milVal.checkCarMileage(car1);
    }

    public void sendMail(CarOrder car1){
        MailSender ms1 = new MailSender();
        mailSender.sendMail(car1);
    }

}

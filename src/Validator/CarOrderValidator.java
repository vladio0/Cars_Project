package Validator;

import Answer.AnswerCityRegister;
import Answer.AnswerInsurance;
import Answer.AnswerMark;
import Answer.AnswerMileage;
import Domain.CarOrder;
import Domain.SaveCarOrder;
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
        CarOrder [] car1Array = readCarOrders();

//        for (int i = 0; i < car1Array.length; i++){
//            System.out.println();
//            checkOneOrder(car1Array[i]);
//        }

        for(CarOrder car1 : car1Array){
            System.out.println();
            checkOneOrder(car1);

        }
    }

    public CarOrder [] readCarOrders(){
        CarOrder [] car1Array = new CarOrder[3];

        for(int i = 0; i < car1Array.length; i++){
            car1Array[i] = SaveCarOrder.buildCarOrder(i);
        }
        return car1Array;
    }

    public void checkOneOrder(CarOrder car1){
        AnswerMark markAnswer = checkCarMark(car1);
        AnswerCityRegister cityAnswer = checkCityRegister(car1);
        AnswerInsurance insuranceAnswer = checkCarInsurance(car1);
        AnswerMileage mileageAnswer = checkCarMileage(car1);

        sendMail(car1);
    }

    public AnswerMark checkCarMark(CarOrder car1){
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

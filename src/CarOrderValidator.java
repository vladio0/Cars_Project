import domain.*;
import domain.deal.CarOrder;
import domain.register.AnswerCityRegister;
import mail.MailSender;
import validator.CarValidator;
import validator.CityRegisterValidator;
import validator.DealValidator;
import validator.RegistrationValidator;

import java.util.LinkedList;
import java.util.List;

public class CarOrderValidator {
    private CityRegisterValidator cityRegisterVal;
    private RegistrationValidator registrationVal;
    private CarValidator carVal;
    private DealValidator dealVal;
    private MailSender mailSender;

    public CarOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        registrationVal = new RegistrationValidator();
        carVal = new CarValidator();
        dealVal = new DealValidator();
        mailSender = new MailSender();
    }

    //MAIN OF CAR ORDER VALIDATOR
    public static void main(String[] args) {

        CarOrderValidator cov = new CarOrderValidator();
        cov.checkAll();

        }

        //CHECKING ALL ORDERS
    public void checkAll(){
        List<CarOrder> coList = readCarOrders();

        for(CarOrder co : coList){
            checkOneOrder(co);
        }
    }

    //READ ORDER
    public List<CarOrder> readCarOrders() {
        List<CarOrder> coList = new LinkedList<>() ;

        for(int i = 0; i < 5; i++) {
            CarOrder co = SaveCarOrder.buildCarOrder(i);
            coList.add(co);
        }

        return coList;
    }

    //CHECK ONE ORDER
    public void checkOneOrder(CarOrder co){
        AnswerCityRegister cityAnswer = checkCityRegister(co);
        AnswerRegistration regAnswer = checkRegistration(co);
        AnswerCar carAnswer = checkCar(co);
        AnswerDeal dealAnswer = checkDeal(co);
        sendMail(co);
    }


    public AnswerCityRegister checkCityRegister(CarOrder co){
      return cityRegisterVal.checkCityRegister(co);
    }

    public AnswerRegistration checkRegistration(CarOrder co){
        return registrationVal.checkRegistration(co);
    }

    public AnswerCar checkCar(CarOrder co){
        return carVal.checkCar(co);
    }

    public AnswerDeal checkDeal(CarOrder co){
        return dealVal.checkDeal(co);
    }

    public void sendMail(CarOrder co){
        mailSender.sendMail(co);
    }
}

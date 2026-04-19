package validator;

import domain.AnswerCar;
import domain.deal.CarOrder;

public class CarValidator {
    public AnswerCar checkCar(CarOrder co) {
        System.out.println("Car is checking");
        return new AnswerCar();
    }
}

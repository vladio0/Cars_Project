package validator;

import domain.AnswerRegistration;
import domain.deal.CarOrder;

public class RegistrationValidator {
    public AnswerRegistration checkRegistration(CarOrder co) {
        System.out.println("Registration is running");
        return new AnswerRegistration();
    }
}

package validator;

import domain.AnswerDeal;
import domain.deal.CarOrder;

public class DealValidator {
    public AnswerDeal checkDeal(CarOrder co) {
        System.out.println("Deal запущен");
        return new AnswerDeal();
    }
}

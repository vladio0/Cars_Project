package domain.register;

import domain.deal.Person;
import domain.deal.Car;

public class AnswerCityRegisterItem {
    public AnswerCityRegisterItem(CityStatus status, Car brand, CityError error) {
    }

    public enum CityStatus{
        YES, NO, ERROR;
    }

    public static class CityError{
        private String code;
        private String text;

        public CityError(String code, String text){
            this.code = code;
            this.text = text;
        }
    }

    private CityStatus status;
    private Person person;
    private Car brand;
    private CityError error;

    public AnswerCityRegisterItem(CityStatus status, Person person, CityError error) {
        this.status = status;
        this.person = person;
        this.error = error;
    }

    public AnswerCityRegisterItem(CityStatus status, Person person, Car brand) {
        this.status = status;
        this.person = person;
        this.brand = brand;
    }

    public AnswerCityRegisterItem(CityStatus status, Person person, Car brand, CityError error) {
        this.status = status;
        this.person = person;
        this.brand = brand;
        this.error = error;
    }

    public CityStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public Car getBrand() {
        return brand;
    }

    public CityError getError() {
        return error;
    }
}

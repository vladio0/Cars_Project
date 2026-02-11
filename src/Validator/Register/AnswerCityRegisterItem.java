package Validator.Register;

import Domain.Car;

public class AnswerCityRegisterItem {
    public enum CityStatus{
        YES, NO, ERROR;
    }

    public static class CityError{
        private String code;
        private String text;

        public CityError(String code, String text) {
            this.code = code;
            this.text = text;
        }

        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }
    }

    private CityStatus status;
    private Car car;
    private CityError error;

    public AnswerCityRegisterItem(CityStatus status, Car car) {
        this.status = status;
        this.car = car;
    }

    public AnswerCityRegisterItem(CityStatus status, Car car, CityError error) {
        this.status = status;
        this.car = car;
        this.error = error;
    }

    public CityStatus getStatus() {
        return status;
    }

    public Car getCar() {
        return car;
    }

    public CityError getError() {
        return error;
    }
}

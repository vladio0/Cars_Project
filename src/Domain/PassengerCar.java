package Domain;

import java.time.LocalDate;

public class PassengerCar extends Car {
    private int seats;
    private String bodyType; // тип кузова --- sedan, hatchback, SUV, coupe
    private String fuelType; // тип палива --- бензин, дизель, електро, гібрид
    private int batteryPower;
    private String transmission;    // механіка / автомат
    private int maxSpeed;           // макс. швидкість

    public PassengerCar(String carName, String modelName, String driverName, String country, LocalDate dateOfRegister) {
        super(carName, modelName, driverName, country, dateOfRegister);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

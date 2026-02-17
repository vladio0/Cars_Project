package Domain;
import java.time.LocalDate;


public abstract class Car {
    private String carName;
    private String modelName;
    private String driverName;
    private LocalDate dateOfRegister; // дата реєстрації
    private String licensePlate; // номерний знак
    private String color; // колір машини
    private int mileage; // пробіг
    private double price; // ціна


    public Car(String carName, String modelName, String driverName, String countryRegister, LocalDate dateOfRegister) {
        this.carName = carName;
        this.modelName = modelName;
        this.driverName = driverName;
        this.dateOfRegister = dateOfRegister;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public LocalDate getDateOfRegister() {
        return dateOfRegister;
    }

    public void setDateOfRegister(LocalDate dateOfRegister) {
        this.dateOfRegister = dateOfRegister;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





}

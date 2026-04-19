package domain.deal;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Car> brand;       // марка (BMW, Audi)
    private String model;       // модель (X5, A6)
    private int year;           // рік
    private double price;       // ціна
    private String color;
    private double engineType;  // 2.0, 3.0
    private int transmission;
    private int mileage;          // пробіг
    private String plateNumber;

    public List<Car> getBrand() {
        return brand;
    }

    public void addCar(Car car) {
        if (brand == null){
            brand = new ArrayList<>(5);
        }
        brand.add(car);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineType() {
        return engineType;
    }

    public void setEngineType(double engineType) {
        this.engineType = engineType;
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}



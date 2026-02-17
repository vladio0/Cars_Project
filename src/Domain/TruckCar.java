package Domain;

import java.time.LocalDate;

public class TruckCar extends Car {
    private String truckType; // van, dump truck, tractor, tank truck
    private double weight; // маса (кг)
    private String fuelType; // дизель, газ

    public TruckCar(String carName, String modelName, String driverName, String country, LocalDate dateOfRegister) {
        super(carName, modelName, driverName, country, dateOfRegister);
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

}


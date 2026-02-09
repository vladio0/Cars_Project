package Domain;

public class TruckCar extends Car {
    private double loadCapacity; // Вантажопідйомність ---  у тоннах або кг
    private String truckType; // фургон, самоскид, тягач, цистерна
    private String engineType; // дизель, газ
    private double grossWeight; // максимальна вага

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }
}


package Domain;

import java.time.LocalDate;

public class ElectricCar extends Car {
        private int batteryPower;

    public ElectricCar(String carName, String modelName, String driverName, String country, LocalDate dateOfRegister) {
        super(carName, modelName, driverName, country, dateOfRegister);
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
}


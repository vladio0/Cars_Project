package Domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CarOrder {
    private long carId;
    private PassengerCar passenger;
    private PassengerCar electro;
    public List<TruckCar> trucks;

    public void addTruck(TruckCar truck) {
        if (trucks == null) {
            trucks = new ArrayList<>(5);
        }
        trucks.add(truck);
    }


    public List<TruckCar> getTruck() {
        return trucks;
    }

    public List<TruckCar> getTrucks() {
        return trucks;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public PassengerCar getPassenger() {
        return passenger;
    }

    public void setPassenger(PassengerCar passenger) {
        this.passenger = passenger;
    }

    public PassengerCar getElectro() {
        return electro;
    }

    public void setElectro(PassengerCar electro) {
        this.electro = electro;
    }


    public void setTrucks(List<TruckCar> trucks) {
        this.trucks = trucks;
    }
}

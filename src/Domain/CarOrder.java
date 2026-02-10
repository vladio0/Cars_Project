package Domain;

public class CarOrder{
    private long carId;
    private PassengerCar passenger;
    private PassengerCar electro;
    private TruckCar truck;



    public TruckCar getTruck() {
        return truck;
    }

    public void setTruck(TruckCar truck) {
        this.truck = truck;
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
}

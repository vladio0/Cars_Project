package Domain;

public class CarOrder{
    private long carId;
    private Car carName;
    private Car modelName;
    private PassengerCar seats;


    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public Car getCarName() {
        return carName;
    }

    public void setCarName(Car carName) {
        this.carName = carName;
    }

    public Car getModelName() {
        return modelName;
    }

    public void setModelName(Car modelName) {
        this.modelName = modelName;
    }

    public PassengerCar getSeats() {
        return seats;
    }

    public void setSeats(PassengerCar seats) {
        this.seats = seats;
    }
}
package Domain;

public class PassengerCar extends Car {
    private int seats;
    private String bodyType; // тип кузова --- sedan, hatchback, SUV, coupe
    private String fuelType; // тип палива --- бензин, дизель, електро, гібрид

    public PassengerCar(){
        System.out.println("Passenger Car is created.");
    }

    public String getPassegerString(){
        return carName + " " + modelName + " seats: " + seats;
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

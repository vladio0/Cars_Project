package Domain;
import Domain.Car;
import Domain.CarOrder;

import java.time.LocalDate;

public class SaveCarOrder {

    public static void main(String [] args) {
        //CarOrder c = new buildCarOrder(10);
        //CarOrder car1 = new CarOrder();
        //  long ans = saveCarOrder(car1);
        // System.out.println(ans);

//        static long saveCarOrder(CarOrder carOrder) {
//            long answer = 199;
//            System.out.println("saveCarOrder");
//
//            return answer;
    }
        public static CarOrder buildCarOrder(long carId) {
            CarOrder car1 = new CarOrder();
            car1.setCarId(carId);

        //passenger1 car - BMW
        PassengerCar passenger = new PassengerCar("BMW", "X5", "Andrei",
                "Ukraine", LocalDate.of(2020, 8, 24));
        passenger.setSeats(5);
        passenger.setBodyType("SUV");
        passenger.setFuelType("gasoline");
        passenger.setLicensePlate("" + (1000 + carId));
        passenger.setMileage(400_000);
        passenger.setColor("Black");

        //electro car - Mercedes
        PassengerCar electro = new PassengerCar("Mercedes", "E63_AMG", "Vladyslav",
                "Switzerland", LocalDate.of( 2026, 12, 31));
        electro.setSeats(5);
        electro.setBodyType("sedan");
        electro.setBatteryPower(2000);
        electro.setLicensePlate("" + (2000 + carId));
        electro.setMileage(500_000);
        electro.setColor("White");

        //truck1 car - Tesla
        TruckCar truck = new TruckCar("VAZ", "1980", "Vladio",
                "Slovakia", LocalDate.of(2027, 1, 1));
        truck.setTruckType("Dump truck");
        truck.setLicensePlate("" + (3000 + carId));
        truck.setMileage(200_000);
        truck.setColor("Red");
        truck.setLoadCapacity(18000.00);
        truck.setGrossWeight(20000.00);


        car1.setPassenger(passenger);
        car1.setElectro(electro);
        car1.setTruck(truck);

        return car1;
    }
}

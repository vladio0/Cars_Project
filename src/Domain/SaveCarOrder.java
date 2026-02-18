package Domain;

import dao.DictionaryDaoImp;

import java.time.LocalDate;
import java.util.List;

public class SaveCarOrder {

    public static void main(String [] args) throws Exception {
        List<Street> d = new DictionaryDaoImp().findStreets("s");
        for(Street s : d){
            System.out.println(s.getStreetName());
        }
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

        //truck1 car - VAZ
        TruckCar truck1 = new TruckCar("VAZ", "1980", "Vladio",
                "Slovakia", LocalDate.of(2027, 1, 1));
        truck1.setTruckType("Dump truck");
        truck1.setLicensePlate("" + (3000 + carId));
        truck1.setMileage(200_000);
        truck1.setColor("Red");
        truck1.setWeight(18000.00);

            //truck1 car - Tractor
            TruckCar truck2 = new TruckCar("Tractor", "1900", "Arsen",
                    "Rumania", LocalDate.of(2022, 3, 25));
            truck2.setTruckType("tractor");
            truck2.setLicensePlate("" + (3000 + carId));
            truck2.setMileage(700_000);
            truck2.setColor("Blue");
            truck2.setWeight(1000.0);


        car1.setPassenger(passenger);
        car1.setElectro(electro);
        car1.addTruck(truck1);
        car1.addTruck(truck2);

            return car1;
    }
}

package Domain;


public class SaveCarOrder {
    public static void main(String [] args) {
   // CarOrder car1 = new CarOrder();

    //buildCarOrder();

     //  long ans = saveCarOrder(car1);
       // System.out.println(ans);
buildCarOrder(10);

    }

    static long saveCarOrder(CarOrder carOrder){
        long answer = 2000;
        System.out.println("Save Car order: " );

        return answer;
    }

    public static CarOrder buildCarOrder(long carId){
        CarOrder car1 = new CarOrder();
        car1.setCarId(carId);
        CarOrder car2 = car1;
        printCarOrder(car2);
      //  PassengerCar seats = new PassengerCar("Fiat","500", "Alexei", "Ukraine", null);

        return car1;
    }

    static void printCarOrder(CarOrder co1){
        System.out.println(co1.getCarId());
    }
}

package Domain;



public class SaveCarOrder {
    public static void main(String [] args) {
   // CarOrder car1 = new CarOrder();

    buildCarOrder();

     //  long ans = saveCarOrder(car1);
       // System.out.println(ans);


    }

    static long saveCarOrder(CarOrder carOrder){
        long answer = 2000;
        System.out.println("Save Car order: " );

        return answer;
    }

    static CarOrder buildCarOrder(){

        CarOrder car1 = new CarOrder();

        PassengerCar seats = new PassengerCar();

//        seats.setCarName("BMW");
//        seats.setModelName("X5");
//        seats.setSeats(5);
//        car1.setSeats(seats);
//
//        seats.getPassegerString();
//
//        String ans = seats.getPassegerString();
//        System.out.println(ans);

        return car1;
    }

}

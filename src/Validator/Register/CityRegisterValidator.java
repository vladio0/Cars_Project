package Validator.Register;

import Answer.AnswerCityRegister;
import Domain.Car;
import Domain.CarOrder;
import Domain.TruckCar;
import exception.CityRegisterException;

import java.util.List;

public class CityRegisterValidator {
    public static String hostName;
    protected int port;
    private static String login;
    String password;

    private CityRegisterChecker carChecker;

    public CityRegisterValidator() {
        carChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(CarOrder car1) {
        AnswerCityRegister ans = new AnswerCityRegister();

        ans.addItem(checkCar(car1.getPassenger()));
        ans.addItem(checkCar(car1.getElectro()));
        for (TruckCar truck : car1.getTrucks()) {
            ans.addItem(checkCar(truck));
        }

        return ans;
    }
        private AnswerCityRegisterItem checkCar(Car car){
            try {
                    CityRegisterResponse electricAns = carChecker.checkCar(car);
                }
            catch(CityRegisterException ex){
                ex.printStackTrace(System.out);
            }
            return null;
    }
}
//            for(int i = 0; i < trucks.size(); i++){
//                CityRegisterCheckerResponse electricAns = carChecker.checkCar(trucks.get(i));
//            }
//
//            for(Iterator<TruckCar> it = trucks.iterator(); it.hasNext(); ){
//                TruckCar truck = it.next();
//                CityRegisterCheckerResponse electricAns = carChecker.checkCar(truck);
//            }
//

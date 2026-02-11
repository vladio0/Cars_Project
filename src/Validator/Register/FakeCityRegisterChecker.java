package Validator.Register;

import Domain.Car;
import Domain.PassengerCar;
import Domain.TruckCar;
import exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    public static final String GOOD_1 = "1000";
    public static final String GOOD_2 = "2000";
    public static final String BAD_1 = "1001";
    public static final String BAD_2 = "2001";
    public static final String ERROR_1 = "1002";
    public static final String ERROR_2 = "2002";



    public CityRegisterResponse checkCar(Car car)
            throws CityRegisterException{
        CityRegisterResponse res = new CityRegisterResponse();

        if (car instanceof PassengerCar) {

            PassengerCar p = (PassengerCar) car;
            String pc = p.getLicensePlate();
            if (pc.equals(GOOD_1) || pc.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if (pc.equals(BAD_1) || pc.equals(BAD_2)) {
                res.setExisting(false);
            }
            if (pc.equals(ERROR_1) || pc.equals(ERROR_2)) {
                CityRegisterException ex = new CityRegisterException("Fake ERROR" + pc);
                throw ex;
            }
        }

        if(car instanceof TruckCar){
            res.setExisting(true);
            res.setTemporal(true);
        }
        System.out.println(res);

        return res;
    }
}

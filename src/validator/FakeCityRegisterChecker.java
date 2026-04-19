package validator;

import domain.deal.Car;
import domain.deal.Buyer;
import domain.deal.Person;
import domain.deal.Seller;
import exception.CityRegisterResponse;
import exception.CityRegisterException;
import exception.TransportException;

public class FakeCityRegisterChecker implements CityRegisterChecker
    {
        private static final String GOOD_1 = "1000";
        private static final String GOOD_2 = "2000";
        private static final String BAD_1 = "1001";
        private static final String BAD_2 = "2001";
        private static final String ERROR_1 = "1002";
        private static final String ERROR_2 = "2002";
        private static final String ERROR_T_1 = "1003";
        private static final String ERROR_T_2 = "2003";

        public CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException {

            CityRegisterResponse res = new CityRegisterResponse();

            if (person instanceof Seller){
                Seller s = (Seller) person;
                String ps = s.getPassportNumber();
                if(ps.equals(GOOD_1) || ps.equals(GOOD_2)){
                    res.setExisting(true);
                    res.setTemporal(false);
                }
                if (ps.equals(ERROR_1) || ps.equals(ERROR_2)) {
                    CityRegisterException ex = new CityRegisterException("1", "GRN ERROR " + ps);
                    throw ex;
                }
                if(ps.equals(ERROR_T_1) || ps.equals(ERROR_T_2)){
                    TransportException ex = new TransportException("Transport ERROR " + ps);
                    throw ex;
                }
            }

            if(person instanceof Buyer){
                res.setExisting(true);
                res.setTemporal(true);
            }

            System.out.println(res);

            return res;
        }

        public CityRegisterResponse checkCar(Car brand) throws CityRegisterException {
            return null;
        }
    }

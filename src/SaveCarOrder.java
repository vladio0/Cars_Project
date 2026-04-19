import domain.deal.CarOrder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SaveCarOrder {
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/car_database",
                "postgres", "123456789"
        );

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM jc_street");
        while(rs.next()){
            System.out.println(rs.getLong(1) + " : " + rs.getString(2));
        }
    }


        static long saveCarOrder(CarOrder carOrder){
        long answer = 200;
        System.out.println("saveCarOrder");
        return answer;
        }

        public static CarOrder buildCarOrder(long id) {
            CarOrder co = new CarOrder();
            co.setCarOrderId(id);



            return co;
        }

        static void printCarOrder(CarOrder caOr){
        System.out.println(caOr.getCarOrderId());
        }

}

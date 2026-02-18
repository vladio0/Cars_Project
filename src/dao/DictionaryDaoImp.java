package dao;

import Domain.Street;
import exception.DaoException;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DictionaryDaoImp implements DictionaryDao {
    private static final String GET_STREET = "SELECT street_code, street_name" +
            " FROM street WHERE UPPER(street_name) LIKE UPPER(?)";

    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/car_project",
                "postgres", "123456789");
        return con;
    }
        public List<Street> findStreets(String pattern) throws DaoException {
        List<Street> result = new LinkedList<>();


        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(GET_STREET)){


            stmt.setString(1, "%" + pattern + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Street str = new Street(rs.getLong("street_code"), rs.getString("street_name"));
            result.add(str);
        }
        }
        catch (SQLException ex) {
            throw new DaoException(ex);
            }
        return result;
    }
}

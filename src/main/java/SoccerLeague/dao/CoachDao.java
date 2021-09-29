package SoccerLeague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoachDao {

    public void read() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * , max(salary) FROM coachs   WHERE hire_date BETWEEN '2019-01-01' AND '2020-01-01' ;");
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println(" coach id : " + resultSet.getInt(1));
                System.out.println(" coach name : " + resultSet.getString(2));
                System.out.println(" coach salary : " + resultSet.getInt(4));
                System.out.println(" coach price : " + resultSet.getInt(5));
            }
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}

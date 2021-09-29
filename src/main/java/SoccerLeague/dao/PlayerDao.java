package SoccerLeague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerDao {

    public void read() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("SELECT player_id,player_name,salary , max(price)FROM players p GROUP BY hire_date ;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(" player id : " + resultSet.getInt(1));
                System.out.println(" player name : " + resultSet.getString(2));
                System.out.println(" player salary : " + resultSet.getInt(3));
                System.out.println(" player price : " + resultSet.getInt(4));
                System.out.println("---------------");
            }
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}

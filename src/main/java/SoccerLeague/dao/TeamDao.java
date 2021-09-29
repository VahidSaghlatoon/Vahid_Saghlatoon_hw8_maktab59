package SoccerLeague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamDao {

    public void read() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("SELECT team_city_name, count(team_name) AS 'teamCount' FROM teams t GROUP BY team_city_name ;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(" city : " + resultSet.getString(1));
                System.out.println(" team count : " + resultSet.getInt(2));
            }
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}

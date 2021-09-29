package SoccerLeague.dao;

import SoccerLeague.entity.Ball;
import SoccerLeague.service.BallService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BallDao {

    public void insert(Ball ball) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO balls\n" +
                    "(ball_id, ball_name)\n" +
                    "VALUES(?, ?);\n");
            preparedStatement.setInt(1, ball.getBallId());
            preparedStatement.setString(2, ball.getBallName());
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void read() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("SELECT ball_id, ball_name\n" +
                    "FROM balls;\n");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2));
            }
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

    public void readById(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("SELECT ball_id, ball_name\n" +
                    "FROM balls WHERE ball_id = ?;\n");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            } else
                System.out.println("cant find this id");
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void updateById(int id , String ballName) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE balls\n" +
                    "SET ball_name=?\n" +
                    "WHERE ball_id=?;\n");
            preparedStatement.setInt(2, id);
            preparedStatement.setString(1,ballName);
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

    public void deleteById(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            BallService ballService = new BallService();
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM balls WHERE ball_id=?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}

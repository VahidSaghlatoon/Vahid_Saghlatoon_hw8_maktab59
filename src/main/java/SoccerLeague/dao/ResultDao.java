package SoccerLeague.dao;

import SoccerLeague.entity.Ball;
import SoccerLeague.entity.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDao {

    public void insert(Result result) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbConfig.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO results\n" +
                    "(result_id, team_id, match_id, `point`, goals_for, goals_against)\n" +
                    "VALUES(?, ?, ?, ?, ?, ?);\n");
            preparedStatement.setInt(1, result.getResultId());
            preparedStatement.setInt(2, result.getTeamId());
            preparedStatement.setInt(3, result.getMatchId());
            preparedStatement.setInt(4, result.getPoint());
            preparedStatement.setInt(5, result.getGoalFor());
            preparedStatement.setInt(6, result.getGoalAgainst());
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
            preparedStatement = connection.prepareStatement("SELECT team_id ,sum(point) AS 'point' FROM results r GROUP BY team_id ORDER  BY `point` DESC");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("team id : " + resultSet.getInt(1));
                System.out.println("sum point : " + resultSet.getInt(2));
                System.out.println("----------------");
            }
            connection.close();
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

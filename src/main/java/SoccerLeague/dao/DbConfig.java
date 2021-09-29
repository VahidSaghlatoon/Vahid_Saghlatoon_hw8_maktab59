package SoccerLeague.dao;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConfig {

    public static Connection getConnection() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/leage");
        dataSource.setUser("root");
        dataSource.setPassword("");
        return dataSource.getConnection();
    }
}

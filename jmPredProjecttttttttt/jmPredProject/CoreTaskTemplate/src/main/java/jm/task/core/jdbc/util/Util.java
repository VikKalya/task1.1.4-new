package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    public static final Util INSTANCE = new Util();
    private Util(){}

    public Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/user?autoReconnect=true&useSSL=false";
        String userName = "root";
        String password = "2332431512Kk";//Проверяем наличие JDBC драйвера для работы с БД
        Connection connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }
}

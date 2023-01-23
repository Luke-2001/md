package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    String serverName = "localhost";
    String myDataBase = "lk";
    String url = "jdbc:mysql://" + serverName + "/" + myDataBase;
    String username = "root";
    String password = "3696";
    Connection conexao;

    Conexao() throws SQLException {
        conexao = DriverManager.getConnection(url, username, password);
    }
}

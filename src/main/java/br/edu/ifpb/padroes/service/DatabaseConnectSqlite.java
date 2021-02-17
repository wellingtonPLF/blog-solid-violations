package br.edu.ifpb.padroes.service;

import java.sql.*;

public class DatabaseConnectSqlite implements DatabaseConnect {

    private String arquivoBanco = "database.db";

    public Connection getConnection() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:"+this.arquivoBanco)) {
            return connection;
        } catch (SQLException throwables) {
            ExceptionHandler.trataExcecao(throwables);
        }
        return null;
    }

}

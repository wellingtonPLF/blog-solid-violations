package br.edu.ifpb.padroes.service;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMigrations {

    DatabaseMigrations() {
        initialSchema();
    }

    DatabaseConnect databaseConnect = new DatabaseConnectSqlite();

    public void initialSchema() {
        try {
            Statement statement = databaseConnect.getConnection().createStatement();
            //Criando tabela de usuários
            statement.execute("CREATE TABLE IF NOT EXISTS POSTAGEM( ID INTEGER, TITULO VARCHAR, USUARIO_ID VARCHAR, MENSAGEM VARCHAR, TIPO VARCHAR )");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

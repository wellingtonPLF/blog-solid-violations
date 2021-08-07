package br.edu.ifpb.padroes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Logger;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.Usuario;
import br.edu.ifpb.padroes.service.UsuarioServiceImpl;

public abstract class DAO<T> implements DAOinterface<T>{
	
	private String arquivoBanco;
	
	public DAO(String arquivoBanco) {
        this.arquivoBanco = arquivoBanco;
    }

    public Connection connect() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:"+arquivoBanco)) {
            Statement statement = connection.createStatement();

            //Criando tabela de usuários
            statement.execute("CREATE TABLE IF NOT EXISTS USUARIO( ID INTEGER, NOME VARCHAR, LOGIN VARCHAR, SENHA VARCHAR )");
            statement.execute("INSERT INTO USUARIO( ID, NOME, LOGIN, SENHA) VALUES (1, 'admin', 'admin', '123')");

          //Criando tabela de postagem
            statement.execute("CREATE TABLE IF NOT EXISTS POSTAGEM( ID INTEGER, TITULO VARCHAR, USUARIO_ID VARCHAR, MENSAGEM VARCHAR, TIPO VARCHAR )");

            PreparedStatement stmt = connection.prepareStatement("select * from USUARIO");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");

                System.out.println( id + " - " + nome);
            }

            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public abstract void add(T modelo);
    
    public void update(T modelo) {
        this.trataExcecao(new Exception("Não implementado ainda"));
    }

    public void delete(T modelo) {
        this.trataExcecao(new Exception("Não implementado ainda"));
    }

    public List<T> list() {
        this.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public T get(Long id) {
        this.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public void trataExcecao(Exception ex) {
        Logger.getLogger(UsuarioServiceImpl.class.getName()).warning(ex.getMessage());
    }
}

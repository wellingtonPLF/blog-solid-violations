package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAOSqlite implements UsuarioDAO {

    private DatabaseConnect databaseConnect = new DatabaseConnectSqlite();

    public void addUsuario(Usuario usuario) {
        Connection conexao = databaseConnect.getConnection();
        try (PreparedStatement stmt = conexao.prepareStatement("INSERT INTO USUARIO( ID, NOME, LOGIN, SENHA) VALUES (?, ?, ?, ?)")) {
            stmt.setLong(1, usuario.getId());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());
            stmt.execute();
        } catch (SQLException ex) {
            ExceptionHandler.trataExcecao(ex);
        }
    }

    public void updateUsuario(Usuario usuario) {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
    }

    public void deleteUsuario(Usuario usuario) {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
    }

    public List<Usuario> listUsuarios() {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public Usuario getUsuario(Long id) {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

}

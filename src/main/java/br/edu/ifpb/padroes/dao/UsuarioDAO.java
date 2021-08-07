package br.edu.ifpb.padroes.dao;

import br.edu.ifpb.padroes.modelo.Usuario;
import br.edu.ifpb.padroes.service.UsuarioServiceImpl;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public class UsuarioDAO extends DAO<Usuario>{
	
	public UsuarioDAO(String arquivoBanco) {
		super(arquivoBanco);
	}

	@Override 
	public void add(Usuario usuario) {
        Connection conexao = connect();
        try (PreparedStatement stmt = conexao.prepareStatement("INSERT INTO USUARIO( ID, NOME, LOGIN, SENHA) VALUES (?, ?, ?, ?)")) {
            stmt.setLong(1, usuario.getId());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());
            stmt.execute();
        } catch (SQLException ex) {
            this.trataExcecao(ex);
        }
    }
}

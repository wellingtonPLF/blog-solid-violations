package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PostagemDAOSqlite implements PostagemDAO {

    private DatabaseConnect databaseConnect = new DatabaseConnectSqlite();

    public void addPostagem(Postagem postagem) {
        Connection conexao = databaseConnect.getConnection();
        try (PreparedStatement stmt = conexao.prepareStatement("INSERT INTO POSTAGEM( ID, TITULO, USUARIO_ID, MENSAGEM, TIPO) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setLong(1, postagem.getId());
            stmt.setString(2, postagem.getTitulo());
            stmt.setLong(3, postagem.getUsuario().getId());
            stmt.setString(4, postagem.getMensagem());
            stmt.setString(5, postagem.getPostagemTipo().name());
            stmt.execute();
        } catch (SQLException ex) {
            ExceptionHandler.trataExcecao(ex);
        }
    }

    public void addPostagemResposta(PostagemResposta postagem) {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
    }

    public void updatePostagem(Postagem postagem) {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
    }

    public void deletePostagem(Postagem postagem) {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
    }

    public List<Postagem> listPostagens() {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

    public Postagem getPostagem(Long id) {
        ExceptionHandler.trataExcecao(new Exception("Não implementado ainda"));
        return null;
    }

}

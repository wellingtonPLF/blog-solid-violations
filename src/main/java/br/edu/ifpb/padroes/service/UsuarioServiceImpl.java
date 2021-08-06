package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.interf.Ipostagem;
import br.edu.ifpb.padroes.interf.Iresposta;
import br.edu.ifpb.padroes.interf.Iuser;
import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;
import br.edu.ifpb.padroes.modelo.Usuario;

import java.util.Date;
import java.util.List;

public class UsuarioServiceImpl implements Iuser, Ipostagem, Iresposta {

    private UsuarioDAO usuarioDAO = new UsuarioDAO("banco.db");
    private PostagemDAO postagemDAO = new PostagemDAO("banco.db");

    @Override
    public void criarUsuario(Usuario usuario) {
        usuarioDAO.addUsuario(usuario);
    }

    @Override
    public void atualizarUsuario(Usuario usuario) {
        usuarioDAO.updateUsuario(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        usuarioDAO.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios(Usuario usuario) {
        return usuarioDAO.listUsuarios();
    }

    @Override
    public Usuario recuperarUsuario(Long id) {
        return usuarioDAO.getUsuario(id);
    }

    @Override
    public void adicionarPostagem(Postagem postagem) {
    	this.postagemDAO.addPostagem(postagem);
    }

    @Override
    public void removerPostagem(Postagem postagem) {
        this.postagemDAO.deletePostagem(postagem);
    }

    @Override
    public void atualizarPostagem(Postagem postagem) {
        this.postagemDAO.updatePostagem(postagem);
    }

    @Override
    public void adicionarResposta(Postagem postagem, Postagem resposta) {
        PostagemResposta postagemResposta = new PostagemResposta();
        postagemResposta.setPostagem(postagem);
        postagemResposta.setUsuario(resposta.getUsuario());
        postagemResposta.setData(new Date());
        this.postagemDAO.addPostagem(postagemResposta);
    }

}

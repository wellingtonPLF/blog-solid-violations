package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

import java.util.List;

public interface PostagemDAO {

    public void addPostagem(Postagem postagem);

    public void addPostagemResposta(PostagemResposta postagem);

    public void updatePostagem(Postagem postagem);

    public void deletePostagem(Postagem postagem);

    public List<Postagem> listPostagens();

    public Postagem getPostagem(Long id);


}

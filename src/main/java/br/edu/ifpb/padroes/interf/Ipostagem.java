package br.edu.ifpb.padroes.interf;

import br.edu.ifpb.padroes.modelo.Postagem;

public interface Ipostagem {
	void adicionarPostagem(Postagem postagem);
    void removerPostagem(Postagem postagem);
    void atualizarPostagem(Postagem postagem);
}

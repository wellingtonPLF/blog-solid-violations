package br.edu.ifpb.padroes.modelo;

public class PostagemPublica extends Postagem {
	private Postagem postagempublica;

	public Postagem getPostagem() {
		return postagempublica;
	}

	public void setPostagem(Postagem postagempublica) {
		this.postagempublica = postagempublica;
	}
}

package br.edu.ifpb.padroes.modelo;

public class PostagemPublica extends Postagem {
	private Postagem postagempublica;

	public Postagem getPostagempublica() {
		return postagempublica;
	}

	public void setPostagempublica(Postagem postagempublica) {
		this.postagempublica = postagempublica;
	}
}

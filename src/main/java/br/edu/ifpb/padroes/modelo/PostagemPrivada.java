package br.edu.ifpb.padroes.modelo;

public class PostagemPrivada extends Postagem{
	private Postagem postagemprivada;

	public Postagem getPostagem() {
		return postagemprivada;
	}

	public void setPostagem(Postagem postagemprivada) {
		this.postagemprivada = postagemprivada;
	}
}

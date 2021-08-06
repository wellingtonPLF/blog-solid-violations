package br.edu.ifpb.padroes.modelo;

public class PostagemPrivada extends Postagem{
	private Postagem postagemprivada;

	public Postagem getPostagemprivada() {
		return postagemprivada;
	}

	public void setPostagemprivada(Postagem postagemprivada) {
		this.postagemprivada = postagemprivada;
	}
}

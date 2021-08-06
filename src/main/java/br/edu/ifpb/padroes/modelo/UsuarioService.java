package br.edu.ifpb.padroes.modelo;

import java.util.List;

public class UsuarioService {

    private Usuario usuario;

    private List<Postagem> postagens;
    

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<Postagem> postagens) {
        this.postagens = postagens;
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
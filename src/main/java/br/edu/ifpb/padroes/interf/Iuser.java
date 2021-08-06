package br.edu.ifpb.padroes.interf;

import java.util.List;

import br.edu.ifpb.padroes.modelo.Usuario;

public interface Iuser {
	
	void criarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario);
    void removerUsuario(Usuario usuario);
    List<Usuario> listarUsuarios(Usuario usuario);
    Usuario recuperarUsuario(Long id);
}

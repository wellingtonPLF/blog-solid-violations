package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Usuario;

import java.util.List;

public interface UsuarioDAO {

    public void addUsuario(Usuario usuario);

    public void updateUsuario(Usuario usuario);

    public void deleteUsuario(Usuario usuario);

    public List<Usuario> listUsuarios();

    public Usuario getUsuario(Long id);

}

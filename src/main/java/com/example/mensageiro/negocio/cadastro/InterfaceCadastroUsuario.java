package com.example.mensageiro.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import com.example.mensageiro.negocio.basica.Usuario;

public interface InterfaceCadastroUsuario {
	
	Usuario salvarUsuario(Usuario entidy);
	
	List<Usuario> listarUsuarios();

	Usuario updateUsuario(Usuario usuario);

	Optional<Usuario> findUsuarioById(Long id);

	void deleteUser(Long id);

}

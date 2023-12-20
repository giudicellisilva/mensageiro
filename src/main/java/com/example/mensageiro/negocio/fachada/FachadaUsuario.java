package com.example.mensageiro.negocio.fachada;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mensageiro.negocio.basica.Usuario;
import com.example.mensageiro.negocio.cadastro.InterfaceCadastroUsuario;

@Service
public class FachadaUsuario {
	@Autowired
	private InterfaceCadastroUsuario cadastroUsuario;
	
	
	public Usuario salvarUsuario(Usuario entidy) {
		return cadastroUsuario.salvarUsuario(entidy);
	}
	
	public List<Usuario> ListarUsuarios(){
		return cadastroUsuario.listarUsuarios();
	}
	
	public Usuario updateUsuario(Usuario entidy){
		return cadastroUsuario.updateUsuario(entidy);
	}
	
	public Optional<Usuario> findUsuarioById(Long id) {
		return cadastroUsuario.findUsuarioById(id);
	}
	
	public void deleteUser(Long id) {
		cadastroUsuario.deleteUser(id);
	}
}

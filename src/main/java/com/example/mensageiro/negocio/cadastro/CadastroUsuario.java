package com.example.mensageiro.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mensageiro.dados.RepositorioUsuario;
import com.example.mensageiro.negocio.basica.Usuario;

@Service
public class CadastroUsuario implements InterfaceCadastroUsuario {
	@Autowired
	private  RepositorioUsuario repositorioUsuario;
	
	@Override
	public Usuario salvarUsuario(Usuario entity){
		return repositorioUsuario.save(entity);
	}
	
	@Override
	public List<Usuario> listarUsuarios(){
		return repositorioUsuario.findAll();
	}
	
	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return repositorioUsuario.save(usuario);
	}
	
	@Override
	public Optional<Usuario> findUsuarioById(Long id) {
		return repositorioUsuario.findById(id);
	}
	
	@Override
	public void deleteUser(Long id) {
		repositorioUsuario.deleteById(id);
	}


}

package com.example.mensageiro.negocio.fachada;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mensageiro.negocio.basica.Grupo;
import com.example.mensageiro.negocio.cadastro.InterfaceCadastroGrupo;

@Service
public class FachadaGrupo {
	@Autowired
	private InterfaceCadastroGrupo cadastroGrupo;
	
	public Grupo procurarGrupoNome(String nome) {
		return cadastroGrupo.procurarGrupoNome(nome);
	}

	public Grupo salvarGrupo(Grupo entity) {
		return cadastroGrupo.salvarGrupo(entity);
	}

	public List<Grupo> listarGrupos(){
		return cadastroGrupo.listarGrupos();
	};

	public Optional<Grupo> procurarGrupoId(Long id){
		return cadastroGrupo.procurarGrupoId(id);
	}

	public void deletarGrupo(Grupo entity) {
		cadastroGrupo.deletarGrupo(entity);
	}
}

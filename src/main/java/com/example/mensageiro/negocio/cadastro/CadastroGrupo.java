package com.example.mensageiro.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mensageiro.dados.RepositorioGrupo;
import com.example.mensageiro.negocio.basica.Grupo;

@Service
public class CadastroGrupo implements InterfaceCadastroGrupo {
	@Autowired
	private RepositorioGrupo repositorioGrupo;
	
	@Override
	public Grupo procurarGrupoNome(String nome) {
		return repositorioGrupo.findByNome(nome);
	}
	
	@Override
	public Grupo salvarGrupo(Grupo entity) {
		if(entity.getId() == 0 && procurarGrupoNome(entity.getNome()) != null) {
			throw new RegistroDuplicadoException("Nome do Grupo já existe");
			
		}else {
			return repositorioGrupo.save(entity);
		}

	}
	
	@Override
	public List<Grupo> listarGrupos(){
		return repositorioGrupo.findAll();
	}
	
	@Override
	public Optional<Grupo> procurarGrupoId(Long id){
		return repositorioGrupo.findById(id);
	}
	
	@Override
	public void deletarGrupo(Grupo entity) {
		repositorioGrupo.delete(entity);
	}
}

package com.example.mensageiro.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mensageiro.dados.RepositoryEndereco;
import com.example.mensageiro.negocio.basica.Endereco;


@Service
public class CadastroEndereco implements InterfaceCadastroEndereco {
	@Autowired
	private RepositoryEndereco repositoryEndereco;
	
	@Override
	public List<Endereco> listEnderecos(){
		return repositoryEndereco.findAll();
	}
	
	@Override
	public Optional<Endereco> findEnderecoById(Long id) {
		return repositoryEndereco.findById(id);
	}

}

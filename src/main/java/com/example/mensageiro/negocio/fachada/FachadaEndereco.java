package com.example.mensageiro.negocio.fachada;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mensageiro.negocio.basica.Endereco;
import com.example.mensageiro.negocio.cadastro.InterfaceCadastroEndereco;

@Service
public class FachadaEndereco {
	@Autowired
	private InterfaceCadastroEndereco cadastroEndereco;
	
	public List<Endereco> ListEnderecos(){
		return cadastroEndereco.listEnderecos();
	}
	
	public Optional<Endereco> findEnderecoById(Long id){
		return cadastroEndereco.findEnderecoById(id);
	}
}

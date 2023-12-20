package com.example.mensageiro.comunicacao.dto.request;

import org.modelmapper.ModelMapper;

import com.example.mensageiro.config.SpringApplicationContext;
import com.example.mensageiro.negocio.basica.Endereco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class EnderecoRequest {
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	public Endereco convertToEntity() {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		
		Endereco object = modelMapper.map(this, Endereco.class);
		return object;
	}
}

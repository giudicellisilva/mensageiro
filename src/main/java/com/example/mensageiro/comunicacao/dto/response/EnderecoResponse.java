package com.example.mensageiro.comunicacao.dto.response;

import org.modelmapper.ModelMapper;

import com.example.mensageiro.config.SpringApplicationContext;
import com.example.mensageiro.negocio.basica.Endereco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class EnderecoResponse {
	private long id;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	public EnderecoResponse(Endereco object) {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		modelMapper.map(object, this);
	}
}

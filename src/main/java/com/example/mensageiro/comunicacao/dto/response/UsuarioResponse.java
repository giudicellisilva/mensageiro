package com.example.mensageiro.comunicacao.dto.response;

import org.modelmapper.ModelMapper;

import com.example.mensageiro.config.SpringApplicationContext;
import com.example.mensageiro.negocio.basica.Usuario;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class UsuarioResponse {
	private long id;
	private String nome;
	private String email;
	private String telefone;
	private EnderecoResponse endereco;
	
	public UsuarioResponse(Usuario object) {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		modelMapper.map(object, this);
	}
}

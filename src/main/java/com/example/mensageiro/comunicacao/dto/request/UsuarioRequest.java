package com.example.mensageiro.comunicacao.dto.request;

import org.modelmapper.ModelMapper;

import com.example.mensageiro.config.SpringApplicationContext;
import com.example.mensageiro.negocio.basica.Usuario;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class UsuarioRequest {
		
	@Size(min = 4, max = 64, message="user name must have between 4 and 64 characteres")
	private String nome;
	private String email;
	private String telefone;
	
	private EnderecoRequest endereco; 
	
	public Usuario convertToEntity() {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		Usuario object = modelMapper.map(this,  Usuario.class);
		return object;
	}
}
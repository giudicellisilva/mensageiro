package com.example.mensageiro.comunicacao.dto.response;

import org.modelmapper.ModelMapper;

import com.example.mensageiro.config.SpringApplicationContext;
import com.example.mensageiro.negocio.basica.Grupo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class GrupoResponse {
	private Long id;
	private String nome;
	
	public GrupoResponse(Grupo object) {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		modelMapper.map(object, this);
	}
}

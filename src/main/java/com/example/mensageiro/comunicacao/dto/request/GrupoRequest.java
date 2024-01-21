package com.example.mensageiro.comunicacao.dto.request;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.example.mensageiro.config.SpringApplicationContext;
import com.example.mensageiro.negocio.basica.Grupo;
import com.example.mensageiro.negocio.basica.Usuario;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class GrupoRequest {
	@Size(min = 4, max=64, message="group name must have between 4 and 64 characteres")
	private String nome;
	private Usuario administrador;
	private List<Usuario> usuarios;
	
	public Grupo convertToEntity() {
		System.out.println("nome:" + nome);
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		Grupo obj = modelMapper.map(this, Grupo.class);
		return obj;
	}
}

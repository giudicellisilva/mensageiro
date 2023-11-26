package com.example.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private long id;
	private String nome;
	private String email;
	private String telefone;
	 
	private Endereco endereco;

}

package com.example.mensageiro.negocio.basica;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Usuario {
	
	@Id
	private long id;
	private String nome;
	private String email;
	private String telefone;
	

	@OneToOne
	@Cascade(CascadeType.ALL)
	private Endereco endereco;

}

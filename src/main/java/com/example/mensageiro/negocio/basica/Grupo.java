package com.example.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grupo {
	
	@Id
	private long id;
	
	private String nome;

}

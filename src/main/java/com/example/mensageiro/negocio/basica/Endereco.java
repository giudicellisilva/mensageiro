package com.example.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	private long id;
	private String logradouro;
	private String Bairro;
	private String cidade;
	private String uf;
	private String cep;

}

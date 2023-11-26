package com.example.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Mensagem {
	
	@Id
	private long id;
	
	private String texto;
	private Date data;
	
}

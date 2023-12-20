package com.example.mensageiro.negocio.basica;

import com.example.mensageiro.comunicacao.dto.request.EnderecoRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true) @Inheritance(strategy = InheritanceType.JOINED) @NoArgsConstructor
public class Endereco {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	public Endereco(long id, String logradouro, String bairro, String cidade, String uf, String cep) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

}

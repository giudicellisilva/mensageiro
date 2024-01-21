package com.example.mensageiro.negocio.basica;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true) @NoArgsConstructor
public class MensagemGrupo extends Mensagem{
	@Id
	private long id;
	
	@ManyToOne
	private Grupo destinatario;

	public MensagemGrupo(long id, String texto, Date data, long id2, Grupo destinatario) {
		super(id, texto, data);
		id = id2;
		this.destinatario = destinatario;
	}
	
	
	
}

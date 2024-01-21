package com.example.mensageiro.negocio.basica;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true) @NoArgsConstructor
public class MensagemPrivate extends Mensagem {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Usuario destinatario;
	
	public MensagemPrivate(long id, String texto, Date data, long id2, Usuario destinatario) {
		super(id, texto, data);
		id = id2;
		this.destinatario = destinatario;
	}

}

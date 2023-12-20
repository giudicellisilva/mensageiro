package com.example.mensageiro.negocio.cadastro;

public class RegistroDuplicadoException extends RuntimeException {
	RegistroDuplicadoException(String message) {
		super(message);
	}
}

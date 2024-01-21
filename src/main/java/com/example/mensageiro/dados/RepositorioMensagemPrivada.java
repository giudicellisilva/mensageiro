package com.example.mensageiro.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mensageiro.negocio.basica.MensagemPrivate;

@Repository
public interface RepositorioMensagemPrivada extends JpaRepository<MensagemPrivate, Long>{

}

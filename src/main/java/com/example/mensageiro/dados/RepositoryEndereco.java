package com.example.mensageiro.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mensageiro.negocio.basica.Endereco;

public interface RepositoryEndereco extends JpaRepository<Endereco, Long> {

}

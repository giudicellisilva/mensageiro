package com.example.mensageiro.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mensageiro.negocio.basica.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	
	List<Usuario> findByEnderecoBairro(String bairro);
}

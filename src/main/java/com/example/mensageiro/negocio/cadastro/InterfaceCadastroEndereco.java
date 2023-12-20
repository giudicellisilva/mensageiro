package com.example.mensageiro.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import com.example.mensageiro.negocio.basica.Endereco;

public interface InterfaceCadastroEndereco {

	List<Endereco> listEnderecos();

	Optional<Endereco> findEnderecoById(Long id);

}

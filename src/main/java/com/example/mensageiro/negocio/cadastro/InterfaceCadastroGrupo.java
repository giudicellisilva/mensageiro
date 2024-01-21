package com.example.mensageiro.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import com.example.mensageiro.negocio.basica.Grupo;

public interface InterfaceCadastroGrupo {

	Grupo procurarGrupoNome(String nome);

	Grupo salvarGrupo(Grupo entity);

	List<Grupo> listarGrupos();

	Optional<Grupo> procurarGrupoId(Long id);

	void deletarGrupo(Grupo entity);

}

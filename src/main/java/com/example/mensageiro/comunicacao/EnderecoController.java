package com.example.mensageiro.comunicacao;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mensageiro.comunicacao.dto.request.EnderecoRequest;
import com.example.mensageiro.comunicacao.dto.response.EnderecoResponse;
import com.example.mensageiro.negocio.basica.Endereco;
import com.example.mensageiro.negocio.fachada.FachadaEndereco;

@RestController
public class EnderecoController {
	@Autowired
	private FachadaEndereco endereco;
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/endereco")
	public List<Endereco> listEnderecos() {
		return endereco.ListEnderecos();
	}
	
	@GetMapping("/endereco/{id}")
	public EnderecoResponse findEnderecoById(@PathVariable Long id) {
		return new EnderecoResponse(endereco.findEnderecoById(id).get());
	}
	
}

package com.example.mensageiro.comunicacao;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.mensageiro.comunicacao.dto.request.GrupoRequest;
import com.example.mensageiro.comunicacao.dto.request.UsuarioRequest;
import com.example.mensageiro.comunicacao.dto.response.GrupoResponse;
import com.example.mensageiro.comunicacao.dto.response.UsuarioResponse;
import com.example.mensageiro.negocio.basica.Grupo;
import com.example.mensageiro.negocio.basica.Usuario;
import com.example.mensageiro.negocio.fachada.FachadaGrupo;
import com.example.mensageiro.negocio.fachada.FachadaUsuario;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class GrupoController {
	@Autowired
	private FachadaGrupo fachadaGrupo;
	@Autowired
	private FachadaUsuario fachadaUsuario;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping("/grupo")
	public GrupoResponse cadastrarGrupo(@RequestBody @Valid GrupoRequest grupo) {
		try {
			return new GrupoResponse(fachadaGrupo.salvarGrupo(grupo.convertToEntity()));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, ex.getMessage());
		}
	}
	
	@GetMapping("/grupo")
	public List<Grupo> listarGrupos(){
		return fachadaGrupo.listarGrupos();
	}
}

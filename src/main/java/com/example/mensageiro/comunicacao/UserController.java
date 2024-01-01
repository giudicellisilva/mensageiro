package com.example.mensageiro.comunicacao;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.mensageiro.comunicacao.dto.request.UsuarioRequest;
import com.example.mensageiro.comunicacao.dto.response.UsuarioResponse;
import com.example.mensageiro.negocio.basica.Usuario;
import com.example.mensageiro.negocio.fachada.FachadaUsuario;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	private FachadaUsuario usuario;
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/usuario")
	public List<Usuario> listarUsuarios(){
		return usuario.ListarUsuarios();
	}
	
	@PostMapping("/usuario")
	public UsuarioResponse salvarUsuario(@RequestBody @Valid UsuarioRequest user) {
		return new UsuarioResponse(usuario.salvarUsuario(user.convertToEntity()));
	}
	
	@GetMapping("/usuario/{id}")
	public UsuarioResponse findUsuarioById(@PathVariable Long id) {
		return new UsuarioResponse(usuario.findUsuarioById(id).get());
	}
	
	@PatchMapping("/usuario/{id}")
	public UsuarioResponse updateUsuario(@PathVariable Long id, @RequestBody @Valid UsuarioRequest user) {
		try {
			Usuario oldUser = usuario.findUsuarioById(id).get();
			TypeMap<UsuarioRequest, Usuario> typeMapper = modelMapper
					.typeMap(UsuarioRequest.class, Usuario.class)
					.addMappings(mapper -> mapper.skip(Usuario::setId));			


			typeMapper.map(user, oldUser);
			return new UsuarioResponse(usuario.updateUsuario(oldUser));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, ex.getMessage());
		}
		
	}
	
	@DeleteMapping("/usuario/{id}")
	public String deleteUser(@PathVariable Long id) {
		try {
			usuario.deleteUser(id);
			return "Usuario deletado!";
		} catch(RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, ex.getMessage());
		}
	}

	

}

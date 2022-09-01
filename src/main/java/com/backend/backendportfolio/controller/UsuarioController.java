package com.backend.backendportfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backendportfolio.entity.Usuario;
import com.backend.backendportfolio.service.UsuarioService;

@RestController
@RequestMapping("")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/guardar")
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
		return new ResponseEntity<>(usuarioService.guardarUsuario(usuario),HttpStatus.CREATED);
	}
	
	@PostMapping("/new/usuario")
	public void guardarUsuario (@RequestBody Usuario usuario) {
		usuarioService.guardarUsuario(usuario);
	}
	
	@GetMapping("/usuario")
	@ResponseBody
	public List<Usuario> TraerUsuarios(){
		return usuarioService.traerUsuarios();
	}
	
	@DeleteMapping ("/usuario/delete/{id}")
	public void borrarUsuario (@PathVariable Integer id) {
		usuarioService.borrarUsuario(id);
	}
	
	
	
	
	
}

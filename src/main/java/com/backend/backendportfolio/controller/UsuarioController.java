package com.backend.backendportfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backendportfolio.entity.Usuario;
import com.backend.backendportfolio.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/guardar")
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
		return new ResponseEntity<>(usuarioService.save(usuario),HttpStatus.CREATED);
	}
	
	
	
	
	
	
}

package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		//Estas deben son las credenciales correctas 
		
		String user = "Fredy";
		String password = "Uca123";
		
		if(usuario.getUsername().equals(user) && usuario.getPassword().equals(password)) {
			return "mostrarMensajeV";
		}else {
			return "mostrarMensajeF";
		}
		
		
	}
}

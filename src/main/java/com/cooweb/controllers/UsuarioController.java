package com.cooweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.model.Usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UsuarioController {
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas() {
		
		return List.of("Diego","Juan","Pedro");
	}
    

	@RequestMapping(value="usuarios/{id}")
	public Usuario listarUsuarios(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Diego");
		usuario.setApellido("Vargas");
		usuario.setEmail("dvargasgodoy@gmail.com");
		usuario.setTelefono("1556665588");
		
		return usuario;
	}
	
	@RequestMapping(value="listar/usuarios")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Diego");
		usuario1.setApellido("Vargas");
		usuario1.setEmail("dvargasgodoy@gmail.com");
		usuario1.setTelefono("1556665588");
	 
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Diego");
		usuario2.setApellido("Vargas");
		usuario2.setEmail("dvargasgodoy@gmail.com");
		usuario2.setTelefono("1556665588");
		 
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Diego");
		usuario3.setApellido("Vargas");
		usuario3.setEmail("dvargasgodoy@gmail.com");
		usuario3.setTelefono("1556665588");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		

		return  usuarios;
	}
}

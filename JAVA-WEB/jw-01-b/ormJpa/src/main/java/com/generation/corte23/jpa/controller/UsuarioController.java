package com.generation.corte23.jpa.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.corte23.jpa.models.UsuarioModelo;
import com.generation.corte23.jpa.services.UsuarioServicios;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
	@Autowired
	UsuarioServicios usuarioService;
	
	
	@DeleteMapping(path ="(/id")
	public String eliminarPorId(@PathVariable ("id") Long id) {
		boolean ok = usuarioService.eliminarUsuario(id);
		if (ok) {
		return "se elimino el usuario";

			
		}else {
			
		}
	}
	
	
	@GetMapping()
	public ArrayList<UsuarioModelo> listarUsuarios(){
		return usuarioService.ListarUsuarios();
	}
	
	@PostMapping()
	public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuarioModelo) {
	return usuarioService.guardarUsuario(usuarioModelo);
	}
	@GetMapping("/query")
	public ArrayList<UsuarioModelo> obtenerPorPrioridad (@RequestParam("prioridad")Integer prioridad){
		return usuarioService.BusquedaPorPrioridad(prioridad);
	}
	
	@GetMapping(path = " id ")
	public Optional<UsuarioModelo> obtenerUusuarioPorId(@PathVariable("id") Long id
			){
		return usuarioService.ObtenerPorId(id);
	}
	
	}

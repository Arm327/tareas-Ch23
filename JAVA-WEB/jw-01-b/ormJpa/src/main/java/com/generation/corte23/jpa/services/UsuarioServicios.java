package com.generation.corte23.jpa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.corte23.jpa.models.UsuarioModelo;
import com.generation.corte23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioServicios {
	
	
	@Autowired
	UsuarioRepositorio usuariorepositorio;
	public boolean eliminarUsuario(Long id) {
	try {
		usuariorepositorio.deleteById(id);
	return true;
	
	}catch (Exception e) {
		return false;
	}
	
	}
	
	
	public ArrayList  <UsuarioModelo>ListarUsuarios(){
		return (ArrayList<UsuarioModelo>) usuariorepositorio.findAll();
				}
		
	
public UsuarioModelo guardarUsuario(UsuarioModelo usuario) {
	return usuariorepositorio.save(usuario);
	
}


public ArrayList<UsuarioModelo> BusquedaPorPrioridad (Integer prioridad){
	return usuariorepositorio.findByPrioridad(prioridad);
	
	}

public Optional<UsuarioModelo> ObtenerPorId(Long id){
	return usuariorepositorio.findById(id);
	
}
}



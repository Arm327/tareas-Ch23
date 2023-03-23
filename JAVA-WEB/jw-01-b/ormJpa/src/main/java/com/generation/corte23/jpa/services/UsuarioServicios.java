package com.generation.corte23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.corte23.jpa.models.UsuarioModelo;
import com.generation.corte23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioServicios {
	@Autowired
	UsuarioRepositorio usuariorepositorio;
	public ArrayList<UsuarioModelo> BusquedaPorPrioridad (Integer prioridad){
		return usuariorepositorio.BusquedaPorPrioridad(prioridad);
	
	}
	public ArrayList  <UsuarioModelo>ListarUsuarios(){
		return (ArrayList<UsuarioModelo>) usuariorepositorio.findAll();
		
	}
	
}

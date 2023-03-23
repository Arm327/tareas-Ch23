package com.generation.corte23.jpa.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.generation.corte23.jpa.models.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModelo, Long> {
	public ArrayList<UsuarioModelo> BusquedaPorPrioridad (Integer prioridad);

}



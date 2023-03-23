package com.generation.corte23.repositores.copy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Respository;

public class LibrosReposipositorios<Libro> {

	public class LibrosRepositorios{
		public List<Libro> listar(){
			List<Libro> Lista = new ArrayList<Libro>();
			Lista.add(new Libro ("Spring Boot", "Luis", "214144"));
			Lista.add(new Libro ("Java", "Luis", "214144"));
			return Lista;
			
		}
	}
}

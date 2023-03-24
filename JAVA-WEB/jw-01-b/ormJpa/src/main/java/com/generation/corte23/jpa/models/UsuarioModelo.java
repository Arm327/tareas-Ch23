package com.generation.corte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "usuario")

public class UsuarioModelo {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false) 
	private long id;
	private String nombre;
	private String email;
	private Integer prioridad;
	
	
	
	
	
	public UsuarioModelo(String nombre, String email, long id, Integer prioridad) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.id = id;
		this.prioridad = prioridad; 
		
		
		
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


}

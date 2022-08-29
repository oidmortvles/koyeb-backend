package com.backend.backendportfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	private String descripcion;
	private String multimedia;
	private Integer usuario_id;
	
	public Proyecto() {
		// TODO Auto-generated constructor stub
	}

}

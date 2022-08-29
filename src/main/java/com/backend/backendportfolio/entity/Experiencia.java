package com.backend.backendportfolio.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empresa;
	private String cargo;
	private Date inicio;
	private Boolean actual;
	private Date finalDate;
	private String descripcion;
	private Integer usuario_id;
	
	public Experiencia() {
		// TODO Auto-generated constructor stub
	}


}

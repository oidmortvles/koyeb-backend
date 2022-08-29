package com.backend.backendportfolio.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String institucion;
	private Date inicio;
	private Boolean actual;
	private Date finalDate;
	private Boolean finalizado;
	private String logoInst;
	private Integer usuario_id;
	
	public Educacion() {
		// TODO Auto-generated constructor stub
	}
	

}

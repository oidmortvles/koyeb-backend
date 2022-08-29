package com.backend.backendportfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String skill;
	private String dominio;
	private Integer usuario_id;
	
	public Skill() {
		// TODO Auto-generated constructor stub
	}

}

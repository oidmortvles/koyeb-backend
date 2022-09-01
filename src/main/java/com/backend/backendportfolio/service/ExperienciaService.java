package com.backend.backendportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backendportfolio.entity.Experiencia;
import com.backend.backendportfolio.repository.ExperienciaRepository;

@Service
public class ExperienciaService {

	@Autowired
	private ExperienciaRepository experienciaRepository;
	
	
	public List<Experiencia> traerExperiencias(){
		return experienciaRepository.findAll();
		
	}
	
	public Experiencia guardarExperiencia(Experiencia experiencia) {
		return experienciaRepository.save(experiencia);
	}
	
	public Experiencia traerExperiencia(Integer id) {
		return experienciaRepository.getReferenceById(id);
	}
	
	public void borrarExperiencia(Integer id) {
		experienciaRepository.deleteById(id);
	}
	
}

package com.backend.backendportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backendportfolio.entity.Skill;
import com.backend.backendportfolio.repository.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository skillRepository;
	
	public List<Skill> traerSkill(){
		return skillRepository.findAll();
		
	} 
	
	public Skill guardarSkill(Skill skill) {
		return skillRepository.save(skill);
	}
	
	public Skill getSkill(Integer id) {
		return skillRepository.getReferenceById(id);
	}
	
	public void borrarSkill(Integer id) {
		skillRepository.deleteById(id);
	}

}

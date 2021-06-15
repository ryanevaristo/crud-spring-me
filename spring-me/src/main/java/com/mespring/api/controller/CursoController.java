package com.mespring.api.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mespring.api.model.Curso;
import com.mespring.api.repositoy.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<Curso> listar() {
		return cursoRepository.findAll();
		
	}
	
	@PostMapping
	public Curso novo(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
		
	}
	
	@PutMapping("/cursos")
	public void UpdateCurso(@PathVariable Curso curso) {
		 cursoRepository.save(curso);
	}  
	
	@DeleteMapping("/{id}")
	public void DeleteCurso(@PathVariable Curso curso) {
		 cursoRepository.deleteById(id);
	}  

}

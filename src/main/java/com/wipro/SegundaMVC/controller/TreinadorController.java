package com.wipro.SegundaMVC.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SegundaMVC.entity.Treinador;
import com.wipro.SegundaMVC.service.TreinadorService;

@RestController
@RequestMapping("/treinador")
public class TreinadorController {

	@Autowired
	private TreinadorService treinadorService;
	
	@GetMapping
	public Iterable<Treinador> obterTodos(){
				
		return treinadorService.obterTodos();
	}
	
	@PostMapping
	public void criarTreinador(@RequestBody Treinador treinador){
		
		treinadorService.criarTreinador(treinador);
	}
	
	@GetMapping("/{id}")
	public Treinador obterPorId(@PathVariable Long id) {
	return treinadorService.obterPorId(id);	
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public String deletarId(@PathVariable Long id){
	      return treinadorService.deleteById(id);	
	}
}
	
	


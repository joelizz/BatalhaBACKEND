package com.wipro.SegundaMVC.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wipro.SegundaMVC.entity.Treinador;
import com.wipro.SegundaMVC.repository.TreinadorRepository;

@Service
public class TreinadorService {
	
	
	@Autowired
    private TreinadorRepository treinadorRepository;

	public Iterable<Treinador> obterTodos(){
		 
		 
		 return treinadorRepository.findAll();
		 
	 }

	public Treinador criarTreinador(Treinador treinador){
		
		return treinadorRepository.save(treinador);
	}
	
	public Treinador obterPorId(Long id){
		
		Optional<Treinador> optionalTreinador = treinadorRepository.findById(id);
		
		return  optionalTreinador.orElseThrow(() -> new RuntimeException("Treinador não existe vacilão"));
		
		
	}

	public String deleteById(Long id) {
		try{
			treinadorRepository.deleteById(id);
			return "Deu boa";
		}catch(Exception e){
			return "Não deu certo";
		}
	}

	
}


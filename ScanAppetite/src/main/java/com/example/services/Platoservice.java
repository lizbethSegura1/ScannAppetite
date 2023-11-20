package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitys.Plato;
import com.example.repository.PlatoRepository;


@Service 

public class Platoservice {
	
	@Autowired
	
	private PlatoRepository repository;
	public List<PlatoRepository> getPlato(){
		return repository.findAll();
		
	}
}

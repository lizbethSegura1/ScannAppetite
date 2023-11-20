package com.example.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitys.Catalogo;
import com.example.repository.CatalogoRepository;

@Service

public class CatalogoService {
	
	@Autowired
	private CatalogoRepository repository;
	public List<Catalogo>getCatalogo(){
		// coment2
		return repository.findAll();
	}
}

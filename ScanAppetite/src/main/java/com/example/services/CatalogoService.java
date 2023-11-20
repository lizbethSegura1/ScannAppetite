package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entitys.Catalogo;

public class CatalogoService {
	
	@Autowired
	private Catalogo repository;
	public List<Catalogo>getCatalogo(){
		return repository.findAll();
	}
}

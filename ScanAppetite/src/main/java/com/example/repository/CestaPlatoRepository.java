package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entitys.Cesta;
import com.example.entitys.CestaPlato;

public interface CestaPlatoRepository extends JpaRepository<CestaPlato, Integer> {

	    List<CestaPlato> findByCestaySelectedPlato(Cesta cesta, boolean selected);
	}


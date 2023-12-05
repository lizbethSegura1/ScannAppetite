package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Catalogo;
import com.example.entitys.Plato; 

@Repository
public interface PlatoRepository extends JpaRepository<Plato, String> {
    List<Plato> findByCatalogoId(String catalogoId);

    List<Plato> findByCatalogo(Catalogo catalogoId);
}
	
//findall plato/catalogo que devuleva 
//lista de paltos del catalogo en el json generara una lita de platos y cada plato con un catalogo 
package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Catalogo;
import com.example.entitys.Plato;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long> {
	List<Plato> findByCatalogoId(String catalogoId);

	List<Plato> findByCatalogo(Catalogo catalogo);

	Optional<Plato> findById(Long long1);
	
	Plato findById(long id);
}

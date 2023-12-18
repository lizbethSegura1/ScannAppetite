package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entitys.Cesta;

public interface CestaRepository extends JpaRepository<Cesta, Integer> {

	// Encontrar todas las cestas asociadas a una mesa
	List<Cesta> findAllByMesaId(String mesaId);

	//List<Cesta> findCestasByPlato_Id(Long id);

	Optional<Cesta> findByMesaId(String mesaId);

	// Encontrar una cesta por el ID del plato
	//List<Cesta> findByPlato_Id(String platoId);

	// Eliminar una cesta por el ID de la mesa
	void deleteByMesaId(String mesaId);

}

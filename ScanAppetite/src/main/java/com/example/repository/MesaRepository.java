package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, String> {
	List<Mesa> findByRestauranteIdRestaurante(String restauranteId);
	Optional<Mesa> findById(String MesaId);
}

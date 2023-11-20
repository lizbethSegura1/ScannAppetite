package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, String> {
	List<Mesa> findByRestauranteIdRestaurante(String restauranteId);
	List<Mesa> findByMesaId(String MesaId);
}

package com.example.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, String> {
	Optional<Restaurante> findById(String Id); 
}

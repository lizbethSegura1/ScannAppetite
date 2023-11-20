package com.example.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Catalogo;

@Repository
public interface CatalogoRepository extends JpaRepository<CatalogoRepository, String> {
	Optional<Catalogo> findByRestauranteIdRestaurante(String restauranteId);

}

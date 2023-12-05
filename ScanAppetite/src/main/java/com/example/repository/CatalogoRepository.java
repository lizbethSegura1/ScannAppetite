package com.example.repository;

import java.sql.Time;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entitys.Catalogo;
import com.example.entitys.Restaurante;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, String> {
	
	Optional<Catalogo> findByRestauranteId(String restauranteId);

    List<Catalogo> findAll();

    List<Catalogo> findByRestauranteAndHorarioInicioBeforeAndHorarioFinAfter(
            Restaurante restaurante, Time horarioInicio, Time horarioFin);
}

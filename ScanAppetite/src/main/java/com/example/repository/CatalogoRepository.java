package com.example.repository;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entitys.Catalogo;
import com.example.entitys.Restaurante;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, String> {
	
	Optional<Catalogo> findByRestauranteId(String restauranteId);

    List<Catalogo> findAll();

    List<Catalogo> findByRestauranteAndHorarioInicioBeforeAndHorarioFinAfter(
            Restaurante restaurante, Time horarioInicio, Time horarioFin);
    

    @Query("SELECT c FROM Catalogo c WHERE c.restaurante = :restaurante " +
            "AND c.horarioInicio <= :horarioFin " +
            "AND c.horarioFin >= :horarioInicio")
    
    List<Catalogo> findByRestauranteAndHorario(
            @Param("restaurante") Restaurante restaurante,
            @Param("horarioInicio") Timestamp horarioInicio,
            @Param("horarioFin") Timestamp horarioFin);
}
    


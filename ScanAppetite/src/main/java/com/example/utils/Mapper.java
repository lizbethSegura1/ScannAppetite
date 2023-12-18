package com.example.utils;

//import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.dto.CatalogoDto;
import com.example.dto.PlatoDto;
import com.example.entitys.Catalogo;
//import com.example.entitys.Cesta;
import com.example.entitys.Plato;

/**
 * convierte entities a DTO objects
 */
public class Mapper {

    private static PlatoDto platoDtoMapper(Plato d) {
    	return null;
        /*return PlatoDto.builder()
                .id(d.getId())
                .price(d.getPrice())
                .name(d.getName())
                .catalogo(catalogoDtoMapper(d.getCatalogo()))
     1           .build();*/
    }

    private static CatalogoDto catalogoDtoMapper(Catalogo c) {
        return CatalogoDto.builder()
                .id(c.getId())
                .build();
    }

    public static List<PlatoDto> platoToPlatoDTO(List<Plato> list) {
        return list.stream()
                .map(Mapper::platoDtoMapper)
                .collect(Collectors.toList());
    }

   /* public static List<PlatoDto> cestaToPlatoDto(List<Cesta> cesta) {
        return cesta.stream()
        		.flatMap(unaCesta -> unaCesta.getPlatos().stream())
                .map(Mapper::platoDtoMapper)
                .collect(Collectors.toList());
    }*/
  

   /* public static BigDecimal getTotalPrice(List<PlatoDto> platos) {
        return platos.stream()
                .map(PlatoDto::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }*/

    public static List<CatalogoDto> catalogoToCatalogoDTO(List<Catalogo> list) {
        return list.stream()
                .map(Mapper::catalogoDtoMapper)
                .collect(Collectors.toList());
    }

    public static List<CatalogoDto> platoToCatalogoDTO(List<Plato> list) {
    	return null;
     /*   return list.stream()
                .filter(distinctByKey(Plato::getCatalogo))
                .map(d -> catalogoDtoMapper(d.getCatalogo()))
                .collect(Collectors.toList());*/
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}

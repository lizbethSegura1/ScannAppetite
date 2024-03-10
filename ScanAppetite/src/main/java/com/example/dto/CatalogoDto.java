package com.example.dto;

import java.util.List;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString


public class CatalogoDto{
    private String descripcion;
    private String horarioInicio;
    private String horarioFin;
    private RestauranteDTO restaurante;
    private String id;
    private List<PlatoDto> platos;
}
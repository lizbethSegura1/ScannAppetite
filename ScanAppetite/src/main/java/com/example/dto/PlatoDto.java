package com.example.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class PlatoDto {
	private Long id;
	private String name;
	private BigDecimal price;
	private CatalogoDto catalogo;
}

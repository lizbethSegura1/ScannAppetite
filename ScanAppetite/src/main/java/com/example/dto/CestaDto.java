package com.example.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString



public class CestaDto {
    private List<PlatoDto> platos;
    private BigDecimal totalPrice;
}

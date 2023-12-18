package com.example.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

// no validation, send to main page in PageableDishesDTO

public class CatalogoDto {
    private String id;
    private String category;
}

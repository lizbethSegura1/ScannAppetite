package com.example.entitys;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
@Table(name="plato")
public class Plato {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name="price")
	private BigDecimal price;
										
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "catalogoId") 
	public Catalogo catalogo;

	@OneToMany(mappedBy = "plato")
	private List<CatalogoPlato> catalogoPlatos;
	@Column(name = "time")
    private LocalDateTime time;
	
	private Catalogo catalogos;
}

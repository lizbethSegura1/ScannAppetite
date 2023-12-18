package com.example.entitys;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

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

public class Cesta {

	@Id
	@GeneratedValue(generator = "sequence-cesta-id")
	@GenericGenerator(name = "sequence-cesta-id", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
		    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "cesta_id_seq"),
			@org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
			@org.hibernate.annotations.Parameter(name = "increment_size", value = "1") })
	
	@Column(name = "id")
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MesaID", referencedColumnName = "ID")
	private Mesa mesa;

	
	@JdbcTypeCode(SqlTypes.JSON)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PlatoID", referencedColumnName = "ID")
	private Plato Platos;
	 
	private List<Plato> platos;

	    public List<Plato> getPlatos() {
	        return platos;
	    }

}


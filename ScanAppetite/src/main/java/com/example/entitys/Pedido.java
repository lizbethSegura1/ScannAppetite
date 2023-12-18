package com.example.entitys;

import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Pedido {

	@Id
	@Column(columnDefinition = "int(10)")
	private Long id;

	private int estado;

	@Column(name = "Tipo_Pago")
	private String tipo_pago;

	@Column(name = "Hora")
	private java.sql.Timestamp hora;

	@ManyToOne
	@JoinColumn(name = "MesaID")
	private Mesa mesa;

	@Enumerated(EnumType.STRING)
	private Status status;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime time;

}

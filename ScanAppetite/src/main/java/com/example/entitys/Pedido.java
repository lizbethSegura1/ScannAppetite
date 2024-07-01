package com.example.entitys;

import jakarta.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
@Table(name = "pedido", catalog = "scanappetite")
public class Pedido implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mesa_id", nullable = false)
	private Mesa mesa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plato_id", nullable = false)
	private Plato platoId;

	@Column(name = "hora_pedido", nullable = false)
	private LocalDateTime horaPedido;

	@Column(name = "estado", nullable = false)
	private String  estado;

	@Transient
	private List<Plato> platosEnCestaUsuario;

	public boolean contienePlato(Long platoId) {
		return platosEnCestaUsuario.stream().anyMatch(plato -> plato.getId().equals(platoId));
	}

	public void agregarPlato(Plato plato) {
		if (platosEnCestaUsuario == null) {
			platosEnCestaUsuario = new ArrayList<>();
		}

		platosEnCestaUsuario.add(plato);
	}
	 public void setEstado(Estado estado) {
	        this.estado = estado.name(); 
	    }

	    public Estado getEstadoEnum() {
	        return Estado.valueOf(this.estado);
	    }

	   
}

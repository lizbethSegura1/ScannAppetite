
package com.example.services;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

import com.example.entitys.DetallePlatoDTO;
import com.example.entitys.Estado;
import com.example.entitys.Mesa;
import com.example.entitys.Pedido;
import com.example.entitys.PedidoResponse;
import com.example.entitys.Plato;
import com.example.entitys.PlatoDTO;
import com.example.entitys.Restaurante;
import com.example.entitys.ResumenPedidoDTO;
import com.example.repository.MesaRepository;
import com.example.repository.PedidoRepository;
import com.example.repository.PlatoRepository;

import jakarta.transaction.Transactional;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;



	@Autowired
	private PlatoRepository platoRepository;

	@Autowired
	private MesaRepository mesaRepository;

	public void agregarPlato(Long mesaId, Long platoId) {
		Pedido pedido = pedidoRepository.findByMesaId(mesaId).get(0);
		if (pedido == null) {
			pedido = new Pedido();
			Optional<Mesa> mesaOptional = mesaRepository.findById(mesaId);
			mesaOptional.ifPresent(pedido::setMesa);
		}

		Plato plato = obtenerPlatoPorId(platoId);

		if (!pedido.contienePlato(platoId)) {

			pedido.agregarPlato(plato);
			// Guardar el pedido actualizado en la base de datos
			pedidoRepository.save(pedido);
		}
	}

	private Plato obtenerPlatoPorId(Long platoId) {
		return platoRepository.findById(platoId)
				.orElseThrow(() -> new NoSuchElementException("Plato no encontrado con ID: " + platoId));
	}

	public Optional<List<Plato>> getPlatosEnPedido(Long pedidoId) {
		Optional<Pedido> optionalPedido = pedidoRepository.findById(pedidoId);

		return optionalPedido.map(pedido -> pedido.getPlatosEnCestaUsuario());
	}

	@Transactional
	public void guardarPedido(@RequestBody PedidoResponse pedidoResponse) {
		Long mesaId = pedidoResponse.getMesaId();
		Optional<Mesa> optionalMesa = mesaRepository.findById(mesaId);

		if (optionalMesa.isPresent()) {
			Mesa mesa = optionalMesa.get();

			List<Integer> platosIds = pedidoResponse.getPlatosSeleccionados();

			for (Integer platoId : platosIds) {
				Pedido pedido = new Pedido();
				pedido.setMesa(mesa);

				Long platoIdLong = (long) platoId.intValue();
				Plato plato = obtenerPlatoPorId(platoIdLong);

				pedido.setPlatoId(plato);
				pedido.setHoraPedido(LocalDateTime.now());
				pedido.setEstado(Estado.NEW);
				pedidoRepository.save(pedido);
			}

		}
	}

	public BigDecimal calcularTotalCuenta(Long mesaId) {
		Pedido pedido = pedidoRepository.findByMesaId(mesaId).get(0);

		if (pedido != null && pedido.getPlatosEnCestaUsuario() != null) {
			BigDecimal total = BigDecimal.ZERO;

			for (Plato plato : pedido.getPlatosEnCestaUsuario()) {
				total = total.add(plato.getPrecio());
			}

			return total;
		}

		return BigDecimal.ZERO;
	}

	public List<Pedido> obtenerPedidosParaMesa(Long mesaId) {
		Pedido pedido = pedidoRepository.findByMesaId(mesaId).get(0);
		return Collections.singletonList(pedido);
	}

	public List<PlatoDTO> obtenerPlatosParaMesa(Long mesaId) {
		// Obtener la lista de pedidos para la mesa
		List<Pedido> pedidos = obtenerPedidosParaMesa(mesaId);

		// Crear una lista para almacenar los platos DTO
		List<PlatoDTO> platosDTO = new ArrayList<>();

		// Iterar sobre los pedidos y obtener la información del plato
		for (Pedido pedido : pedidos) {
			Plato plato = pedido.getPlatoId();

			// Crear un DTO para el plato con la información relevante
			PlatoDTO platoDTO = new PlatoDTO();
			platoDTO.setId(plato.getId());
			platoDTO.setNombre(plato.getNombre());
			platoDTO.setPrice(plato.getPrecio());

			// Agregar el DTO a la lista de platosDTO
			platosDTO.add(platoDTO);
		}

		return platosDTO;
	}

	public ResumenPedidoDTO obtenerResumenPedido(Long mesaId) {
		List<Pedido> pedidos = pedidoRepository.findAllByMesaId(mesaId);
		BigDecimal total = BigDecimal.ZERO;
		List<DetallePlatoDTO> detallesPlatos = new ArrayList<>(pedidos.size());

		for (Pedido pedido : pedidos) {
			Plato plato = pedido.getPlatoId();
			total = total.add(plato.getPrecio());
			detallesPlatos.add(new DetallePlatoDTO(plato.getNombre(), plato.getPrecio()));
		}

		return new ResumenPedidoDTO(detallesPlatos, total);
	}
}

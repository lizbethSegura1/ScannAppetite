package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitys.Catalogo;
import com.example.entitys.Pedido;
import com.example.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired

	private PedidoRepository repository;

	public List<PedidoRepository> getPedido() {
		return repository.findAll();
	}

}

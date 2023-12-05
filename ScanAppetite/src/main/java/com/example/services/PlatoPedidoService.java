package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entitys.Plato;
import com.example.entitys.PlatoPedido;
import com.example.repository.PlatoPedidoRepository;

@Service
public class PlatoPedidoService {
	@Autowired
	private PlatoPedidoRepository repository;

	public List<Plato> getPlatoPedido() {
		return repository.findAll();

	}

}

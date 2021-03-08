package com.ce.redfort.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ce.redfort.loja.client.FornecedorClient;
import com.ce.redfort.loja.dto.CompraDTO;
import com.ce.redfort.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {
		
	@Autowired
	private FornecedorClient fornecedorClient;
	
	public void realizaCompra(CompraDTO compraDTO) {
		
		InfoFornecedorDTO infoPorEstado = fornecedorClient.getInfoPorEstado(compraDTO.getEndereco().getEstado());
		
		System.out.println(infoPorEstado.getEndereco());
	}

}

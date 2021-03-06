package com.ce.redfort.loja.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ce.redfort.loja.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@PostMapping()
	public void realizaCompra(@RequestBody CompraDTO compra) {
		
	}

}

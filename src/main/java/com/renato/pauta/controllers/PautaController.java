package com.renato.pauta.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.renato.pauta.dtos.PautaDTO;

@RestController
@RequestMapping("/api/pautas")
public class PautaController {

	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PautaDTO create(@RequestBody PautaDTO pautaDTO) {
		return new PautaDTO();
	}

}

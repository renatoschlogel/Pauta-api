package com.renato.pauta.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.renato.pauta.dtos.PautaDTO;
import com.renato.pauta.entities.Pauta;
import com.renato.pauta.services.PautaService;

@RestController
@RequestMapping("/api/pautas")
public class PautaController {
	
	private PautaService pautaService;
	
	private ModelMapper modelMapper; 
	
	public PautaController(PautaService pautaService, ModelMapper modelMapper) {
		this.pautaService = pautaService;
		this.modelMapper = modelMapper;
	}

	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PautaDTO create(@RequestBody PautaDTO pautaDTO) {
		return pautaDTO;
//		Pauta pauta = modelMapper.map(pautaDTO, Pauta.class);
//		pauta = pautaService.incluir(pauta);
//		return modelMapper.map(pauta, PautaDTO.class);
	}

}

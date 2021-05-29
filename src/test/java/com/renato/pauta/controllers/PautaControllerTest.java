package com.renato.pauta.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.renato.pauta.dtos.PautaDTO;


@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@WebMvcTest( controllers = PautaController.class)
@AutoConfigureMockMvc
public class PautaControllerTest {
	
	static String PAUTA_API = "/api/pautas";
	
	@Autowired
	MockMvc mvc;
	
	@Test
	@DisplayName("Deve cadastrar uma Pauta")
	void deveCadastrarUmaPauta () throws Exception {
		
		PautaDTO pautaDTO = new PautaDTO();
		
		String json = new ObjectMapper().writeValueAsString(pautaDTO);
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
				.post(PAUTA_API)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(json);
		
		mvc.perform(request)
		   .andExpect(status().isCreated());
	}

}

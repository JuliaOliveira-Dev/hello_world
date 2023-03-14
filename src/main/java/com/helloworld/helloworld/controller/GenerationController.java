package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Generation-BSM")
public class GenerationController {

	@GetMapping
	public String genereation() {
		return "Responsabilidade Pessoal, Mentalidade de Crescimento, Orientação ao Futuro, Persistência, Comunicação, Orientação aos Detalhes, Trabalho em Equipe e Proatividade";
	}

}

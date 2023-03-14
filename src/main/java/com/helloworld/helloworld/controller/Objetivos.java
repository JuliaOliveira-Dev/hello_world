package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos-Semanais")
public class Objetivos {

	@GetMapping
	public String genereation() {
		return "Orientação ao Futuro, Mentalidade de Crescimento, Proatividade e Comunicação";

	}

}

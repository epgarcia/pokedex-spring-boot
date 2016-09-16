package com.liferay.pokemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PokemonViewController {

	@RequestMapping("/")
	public String index(Map<String, Object> context) {
		return "Gotta Catch 'Em All";
	}

}

package com.liferay.pokemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PokemonViewController {

	@GetMapping("/")
	public String index(Map<String, Object> context) {
		return "index";
	}

}

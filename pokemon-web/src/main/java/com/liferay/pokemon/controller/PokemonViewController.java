package com.liferay.pokemon.controller;

import com.liferay.pokemon.util.PokemonRestClientUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PokemonViewController {

	@GetMapping("/")
	public String index(Map<String, Object> context) {
		context.put("pokemons", PokemonRestClientUtil.getPokemons());

		return "index";
	}

}

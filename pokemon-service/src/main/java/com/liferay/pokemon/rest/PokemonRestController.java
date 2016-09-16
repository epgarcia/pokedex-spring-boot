package com.liferay.pokemon.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonRestController {

	@RequestMapping(value = "/pokemon/get", method = RequestMethod.GET)
	public String getPokemon(
		@RequestParam(value = "name", defaultValue = "") String name) {

		return "Gotta Catch 'Em All " + name;
	}

}
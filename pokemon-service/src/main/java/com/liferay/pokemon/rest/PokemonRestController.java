package com.liferay.pokemon.rest;

import com.liferay.pokemon.model.Pokemon;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonRestController {

	@RequestMapping(value = "/pokemon/get", method = RequestMethod.GET)
	public Pokemon getPokemon(
		@RequestParam(value = "name", defaultValue = "") String name) {

		Pokemon pokemon = new Pokemon(name, "");

		return pokemon;
	}

	@RequestMapping(value = "/pokemon/get/{name}", method = RequestMethod.GET)
	public Pokemon getPokemonByName(@PathVariable(value = "name") String name) {
		Pokemon pokemon = new Pokemon(name, "");

		return pokemon;
	}

}
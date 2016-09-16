package com.liferay.pokemon.rest;

import com.liferay.pokemon.model.Pokemon;
import com.liferay.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonRestController {

	@Autowired
	private PokemonRepository repository;

	@RequestMapping(value = "/add", method = RequestMethod.PUT)
	public Pokemon addPokemon(
		@RequestParam(value="pokemonId") Long pokemonId,
		@RequestParam(value="name") String name,
		@RequestParam(value="type") String type,
		@RequestParam(value="smallImageURL", defaultValue = "") String smallImageURL) {

		Pokemon pokemon = new Pokemon(pokemonId, name, type, smallImageURL);

		return repository.save(pokemon);
	}

	@RequestMapping(value = "/get/{pokemonId}", method = RequestMethod.GET)
	public String getPokemon(@PathVariable Long pokemonId) {
		Pokemon pokemon = repository.findByPokemonId(pokemonId);

		return pokemon.toString();
	}

	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public List<Pokemon> getPokemons() {
		return repository.findByAssetType("pokemon");
	}

	@RequestMapping(value = "/get/type/{type}", method = RequestMethod.GET)
	public List<Pokemon> getPokemonByType(@PathVariable String type) {
		return repository.findByType(type);
	}

}
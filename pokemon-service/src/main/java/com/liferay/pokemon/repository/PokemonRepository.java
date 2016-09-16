package com.liferay.pokemon.repository;

import com.liferay.pokemon.model.Pokemon;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PokemonRepository extends ElasticsearchRepository<Pokemon, String> {

	public Pokemon deleteById(String id);

	public Pokemon deleteByPokemonId(Long pokemonId);

	@Override
	public List<Pokemon> findAll();

	public Pokemon findByName(String name);

	public Pokemon findById(String id);

	public List<Pokemon> findByAssetType(String assetType);

	public Pokemon findByPokemonId(Long pokemonId);

	public List<Pokemon> findByType(String type);

}

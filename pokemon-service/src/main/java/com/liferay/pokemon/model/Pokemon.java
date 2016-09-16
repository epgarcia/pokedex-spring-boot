package com.liferay.pokemon.model;

public class Pokemon {

	public Pokemon() {
	}

	public Pokemon(String name, String type) {
	    this(0, name, type, "");
	}

	public Pokemon(
		long pokemonId, String name, String type, String smallImageURL) {

		this.assetType = "pokemon";
		this.pokemonId = pokemonId;
		this.name = name;
		this.type = type;
		this.smallImageURL = smallImageURL;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Long pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSmallImageURL() {
		return smallImageURL;
	}

	public void setSmallImageURL(String smallImageURL) {
		this.smallImageURL = smallImageURL;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	private String id;
	private long pokemonId;
	private String assetType;
	private String name;
	private String type;
	private String smallImageURL;

}

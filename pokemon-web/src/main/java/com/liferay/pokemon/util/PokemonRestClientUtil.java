package com.liferay.pokemon.util;

import com.liferay.pokemon.model.Pokemon;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class PokemonRestClientUtil {

	public static Pokemon[] getPokemons() {
		HttpHeaders requestHeaders = new HttpHeaders();

		requestHeaders.setAccept(
			Collections.singletonList(new MediaType("application","json")));

		HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);

		RestTemplate restTemplate = new RestTemplate();

		restTemplate.getMessageConverters().add(
			new MappingJackson2HttpMessageConverter());

		ResponseEntity<Pokemon[]> responseEntity = restTemplate.exchange(
			_URL, HttpMethod.GET, requestEntity, Pokemon[].class);

		return responseEntity.getBody();
	}

	private static final String _URL = "http://localhost:8070/pokemon/get/all";

}

package com.proyectouwu.pkmnapi.pkmn_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private static final String BASE_URL_PKMN = "https://pokeapi.co/api/v2/pokemon/";

    public String getPokemonList(final Long limit) {
        final String uri = BASE_URL_PKMN + "?limit=" + limit;
        final RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }

    public String getOnePokemon(final Long PkmnId) {
        final String uri = BASE_URL_PKMN + PkmnId;
        final RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }
}

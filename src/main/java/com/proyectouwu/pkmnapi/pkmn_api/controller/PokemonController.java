package com.proyectouwu.pkmnapi.pkmn_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectouwu.pkmnapi.pkmn_api.service.PokemonService;

@RestController
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pkmn")
    public String getPkmnList(@RequestParam("limit") Long limit) {

        return this.pokemonService.getPokemonList(limit);
    }

    @GetMapping("/pkmn/{PkmnId}")
    public String getOnePkmn(@PathVariable("PkmnId") Long pkmnId) {

        return this.pokemonService.getOnePokemon(pkmnId);
    }

}

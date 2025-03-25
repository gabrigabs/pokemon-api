package com.api.pokemonapi.controller;

import com.api.pokemonapi.dtos.responses.PokemonAbilitiesResponseDTO;
import com.api.pokemonapi.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("/api/pokemon")
@RequiredArgsConstructor
public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping("/{name}")
    public Mono<ResponseEntity<PokemonAbilitiesResponseDTO>> getPokemonAbilities(@PathVariable String name) {
        return pokemonService.getPokemonAbilities(name)
                .map(ResponseEntity::ok);
    }
}
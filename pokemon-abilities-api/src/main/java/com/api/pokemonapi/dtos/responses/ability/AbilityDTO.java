package com.api.pokemonapi.dtos.responses.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbilityDTO {
    @JsonProperty("ability")
    private AbilityDetailsDTO abilityDetails;

    @JsonProperty("is_hidden")
    private boolean isHidden;

    private int slot;
}
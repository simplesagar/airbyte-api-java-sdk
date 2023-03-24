/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePokeapi - The values required to configure the source.
 */
public class SourcePokeapi {
    @JsonProperty("airbyte-source-name")public SourcePokeapiPokeapiEnum airbyteSourceName;
    public SourcePokeapi withAirbyteSourceName(SourcePokeapiPokeapiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Pokemon requested from the API.
     */
    @JsonProperty("pokemon_name")public String pokemonName;
    public SourcePokeapi withPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
        return this;
    }
    
}

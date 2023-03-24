/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGreenhouse - The values required to configure the source.
 */
public class SourceGreenhouse {
    @JsonProperty("airbyte-source-name")public SourceGreenhouseGreenhouseEnum airbyteSourceName;
    public SourceGreenhouse withAirbyteSourceName(SourceGreenhouseGreenhouseEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Greenhouse API Key. See the <a href="https://docs.airbyte.com/integrations/sources/greenhouse">docs</a> for more information on how to generate this key.
     */
    @JsonProperty("api_key")public String apiKey;
    public SourceGreenhouse withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
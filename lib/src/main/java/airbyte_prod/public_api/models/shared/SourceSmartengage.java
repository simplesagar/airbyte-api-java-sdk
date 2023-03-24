/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSmartengage - The values required to configure the source.
 */
public class SourceSmartengage {
    @JsonProperty("airbyte-source-name")public SourceSmartengageSmartengageEnum airbyteSourceName;
    public SourceSmartengage withAirbyteSourceName(SourceSmartengageSmartengageEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * API Key
     */
    @JsonProperty("api_key")public String apiKey;
    public SourceSmartengage withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}

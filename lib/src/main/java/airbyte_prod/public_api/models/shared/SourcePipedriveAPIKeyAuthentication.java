/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePipedriveAPIKeyAuthentication {
    /**
     * The Pipedrive API Token.
     */
    @JsonProperty("api_token")public String apiToken;
    public SourcePipedriveAPIKeyAuthentication withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("auth_type")public SourcePipedriveAPIKeyAuthenticationAuthTypeEnum authType;
    public SourcePipedriveAPIKeyAuthentication withAuthType(SourcePipedriveAPIKeyAuthenticationAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}

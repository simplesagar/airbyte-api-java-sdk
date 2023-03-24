/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePinterestCredentialsOAuth20 {
    @JsonProperty("auth_method")public SourcePinterestCredentialsOAuth20AuthMethodEnum authMethod;
    public SourcePinterestCredentialsOAuth20 withAuthMethod(SourcePinterestCredentialsOAuth20AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    /**
     * The Client ID of your OAuth application
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")public String clientId;
    public SourcePinterestCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your OAuth application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")public String clientSecret;
    public SourcePinterestCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    @JsonProperty("refresh_token")public String refreshToken;
    public SourcePinterestCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
}

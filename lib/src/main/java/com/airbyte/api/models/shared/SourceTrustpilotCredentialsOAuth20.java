/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceTrustpilotCredentialsOAuth20 {
    /**
     * Access Token for making authenticated requests.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceTrustpilotCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceTrustpilotCredentialsOAuth20AuthType authType;

    public SourceTrustpilotCredentialsOAuth20 withAuthType(SourceTrustpilotCredentialsOAuth20AuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The API key of the Trustpilot API application. (represents the OAuth Client ID)
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceTrustpilotCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Secret of the Trustpilot API application. (represents the OAuth Client Secret)
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceTrustpilotCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The key to refresh the expired access_token.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceTrustpilotCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    /**
     * The date-time when the access token should be refreshed.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("token_expiry_date")
    public OffsetDateTime tokenExpiryDate;

    public SourceTrustpilotCredentialsOAuth20 withTokenExpiryDate(OffsetDateTime tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
        return this;
    }
    
    public SourceTrustpilotCredentialsOAuth20(@JsonProperty("access_token") String accessToken, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("token_expiry_date") OffsetDateTime tokenExpiryDate) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.tokenExpiryDate = tokenExpiryDate;
  }
}

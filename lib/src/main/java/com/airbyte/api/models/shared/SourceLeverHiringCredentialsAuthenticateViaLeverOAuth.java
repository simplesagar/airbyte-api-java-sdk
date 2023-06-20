/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLeverHiringCredentialsAuthenticateViaLeverOAuth - Choose how to authenticate to Lever Hiring.
 */

public class SourceLeverHiringCredentialsAuthenticateViaLeverOAuth {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceLeverHiringCredentialsAuthenticateViaLeverOAuthAuthType authType;

    public SourceLeverHiringCredentialsAuthenticateViaLeverOAuth withAuthType(SourceLeverHiringCredentialsAuthenticateViaLeverOAuthAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your Lever Hiring developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public SourceLeverHiringCredentialsAuthenticateViaLeverOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Lever Hiring developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceLeverHiringCredentialsAuthenticateViaLeverOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The token for obtaining new access token.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceLeverHiringCredentialsAuthenticateViaLeverOAuth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public SourceLeverHiringCredentialsAuthenticateViaLeverOAuth(@JsonProperty("refresh_token") String refreshToken) {
        this.refreshToken = refreshToken;
  }
}

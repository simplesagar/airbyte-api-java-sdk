/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth - Credentials for connecting to the Google Sheets API
 */
public class SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth {
    @JsonProperty("auth_type")
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum authType;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withAuthType(SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Enter your Google application's Client ID
     */
    @JsonProperty("client_id")
    public String clientId;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Enter your Google application's Client Secret
     */
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Enter your Google application's refresh token
     */
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    

    public SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth(@JsonProperty("auth_type") SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken) {
    this.authType = authType;
this.clientId = clientId;
this.clientSecret = clientSecret;
this.refreshToken = refreshToken;
  }
}

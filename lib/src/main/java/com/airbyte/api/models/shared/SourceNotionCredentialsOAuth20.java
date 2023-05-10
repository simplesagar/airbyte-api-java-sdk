/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceNotionCredentialsOAuth20 - Pick an authentication method.
 */
public class SourceNotionCredentialsOAuth20 {
    /**
     * Access Token is a token you received by complete the OauthWebFlow of Notion.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceNotionCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceNotionCredentialsOAuth20AuthTypeEnum authType;

    public SourceNotionCredentialsOAuth20 withAuthType(SourceNotionCredentialsOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The ClientID of your Notion integration.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceNotionCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The ClientSecret of your Notion integration.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceNotionCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    public SourceNotionCredentialsOAuth20(@JsonProperty("access_token") String accessToken, @JsonProperty("auth_type") SourceNotionCredentialsOAuth20AuthTypeEnum authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret) {
        this.accessToken = accessToken;
        this.authType = authType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
  }
}

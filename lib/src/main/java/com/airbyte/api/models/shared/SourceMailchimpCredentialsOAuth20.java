/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMailchimpCredentialsOAuth20 {
    /**
     * An access token generated using the above client ID and secret.
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceMailchimpCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceMailchimpCredentialsOAuth20AuthTypeEnum authType;
    public SourceMailchimpCredentialsOAuth20 withAuthType(SourceMailchimpCredentialsOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your OAuth application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;
    public SourceMailchimpCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your OAuth application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceMailchimpCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
}
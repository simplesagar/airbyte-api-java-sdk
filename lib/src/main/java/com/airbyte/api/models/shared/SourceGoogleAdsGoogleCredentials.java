/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleAdsGoogleCredentials {
    /**
     * Access Token for making authenticated requests. More instruction on how to find this value in our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;docs&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceGoogleAdsGoogleCredentials withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * The Client ID of your Google Ads developer application. More instruction on how to find this value in our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;docs&lt;/a&gt;
     */
    @JsonProperty("client_id")
    public String clientId;
    public SourceGoogleAdsGoogleCredentials withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Google Ads developer application. More instruction on how to find this value in our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;docs&lt;/a&gt;
     */
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceGoogleAdsGoogleCredentials withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Developer token granted by Google to use their APIs. More instruction on how to find this value in our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;docs&lt;/a&gt;
     */
    @JsonProperty("developer_token")
    public String developerToken;
    public SourceGoogleAdsGoogleCredentials withDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
        return this;
    }
    
    /**
     * The token for obtaining a new access token. More instruction on how to find this value in our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;docs&lt;/a&gt;
     */
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceGoogleAdsGoogleCredentials withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    

    public SourceGoogleAdsGoogleCredentials(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("developer_token") String developerToken, @JsonProperty("refresh_token") String refreshToken) {
    this.clientId = clientId;
this.clientSecret = clientSecret;
this.developerToken = developerToken;
this.refreshToken = refreshToken;
  }
}

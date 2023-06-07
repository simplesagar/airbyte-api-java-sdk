/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationCumulio - The values required to configure the destination.
 */
public class DestinationCumulio {
    /**
     * URL of the Cumul.io API (e.g. 'https://api.cumul.io', 'https://api.us.cumul.io', or VPC-specific API url). Defaults to 'https://api.cumul.io'.
     */
    @JsonProperty("api_host")
    public String apiHost;

    public DestinationCumulio withApiHost(String apiHost) {
        this.apiHost = apiHost;
        return this;
    }
    
    /**
     * An API key generated in Cumul.io's platform (can be generated here: https://app.cumul.io/start/profile/integration).
     */
    @JsonProperty("api_key")
    public String apiKey;

    public DestinationCumulio withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The corresponding API token generated in Cumul.io's platform (can be generated here: https://app.cumul.io/start/profile/integration).
     */
    @JsonProperty("api_token")
    public String apiToken;

    public DestinationCumulio withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationCumulioCumulio destinationType;

    public DestinationCumulio withDestinationType(DestinationCumulioCumulio destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    public DestinationCumulio(@JsonProperty("api_host") String apiHost, @JsonProperty("api_key") String apiKey, @JsonProperty("api_token") String apiToken, @JsonProperty("destinationType") DestinationCumulioCumulio destinationType) {
        this.apiHost = apiHost;
        this.apiKey = apiKey;
        this.apiToken = apiToken;
        this.destinationType = destinationType;
  }
}
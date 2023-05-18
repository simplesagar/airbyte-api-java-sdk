/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMeilisearch - The values required to configure the destination.
 */
public class DestinationMeilisearch {
    /**
     * MeiliSearch API Key. See the &lt;a href="https://docs.airbyte.com/integrations/destinations/meilisearch"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_key")
    public String apiKey;

    public DestinationMeilisearch withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationMeilisearchMeilisearch destinationType;

    public DestinationMeilisearch withDestinationType(DestinationMeilisearchMeilisearch destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Hostname of the MeiliSearch instance.
     */
    @JsonProperty("host")
    public String host;

    public DestinationMeilisearch withHost(String host) {
        this.host = host;
        return this;
    }
    
    public DestinationMeilisearch(@JsonProperty("destinationType") DestinationMeilisearchMeilisearch destinationType, @JsonProperty("host") String host) {
        this.destinationType = destinationType;
        this.host = host;
  }
}

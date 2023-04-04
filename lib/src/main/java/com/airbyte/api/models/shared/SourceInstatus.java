/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceInstatus - The values required to configure the source.
 */
public class SourceInstatus {
    /**
     * Instatus REST API key
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceInstatus withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceInstatusInstatusEnum sourceType;
    public SourceInstatus withSourceType(SourceInstatusInstatusEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}

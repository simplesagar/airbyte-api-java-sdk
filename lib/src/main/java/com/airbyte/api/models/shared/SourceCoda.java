/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceCoda - The values required to configure the source.
 */
public class SourceCoda {
    /**
     * Bearer token
     */
    @JsonProperty("auth_token")
    public String authToken;
    public SourceCoda withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceCodaCodaEnum sourceType;
    public SourceCoda withSourceType(SourceCodaCodaEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceVantage - The values required to configure the source.
 */
public class SourceVantage {
    /**
     * Your API Access token. See &lt;a href="https://vantage.readme.io/reference/authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceVantage withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceVantageVantageEnum sourceType;
    public SourceVantage withSourceType(SourceVantageVantageEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}
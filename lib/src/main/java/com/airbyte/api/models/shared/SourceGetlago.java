/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGetlago - The values required to configure the source.
 */
public class SourceGetlago {
    /**
     * Your API Key. See &lt;a href="https://doc.getlago.com/docs/api/intro"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceGetlago withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGetlagoGetlago sourceType;

    public SourceGetlago withSourceType(SourceGetlagoGetlago sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceGetlago(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceGetlagoGetlago sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}

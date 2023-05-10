/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleWebfonts - The values required to configure the source.
 */
public class SourceGoogleWebfonts {
    /**
     * Optional, Available params- json, media, proto
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alt")
    public String alt;

    public SourceGoogleWebfonts withAlt(String alt) {
        this.alt = alt;
        return this;
    }
    
    /**
     * API key is required to access google apis, For getting your's goto google console and generate api key for Webfonts
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceGoogleWebfonts withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Optional, boolean type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prettyPrint")
    public String prettyPrint;

    public SourceGoogleWebfonts withPrettyPrint(String prettyPrint) {
        this.prettyPrint = prettyPrint;
        return this;
    }
    
    /**
     * Optional, to find how to sort
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;

    public SourceGoogleWebfonts withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGoogleWebfontsGoogleWebfontsEnum sourceType;

    public SourceGoogleWebfonts withSourceType(SourceGoogleWebfontsGoogleWebfontsEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceGoogleWebfonts(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceGoogleWebfontsGoogleWebfontsEnum sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}

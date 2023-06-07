/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAsana - The values required to configure the source.
 */
public class SourceAsana {
    /**
     * Choose how to authenticate to Github
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public SourceAsana withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    public SourceAsanaAsana sourceType;

    public SourceAsana withSourceType(SourceAsanaAsana sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceAsana(){}
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceXkcd - The values required to configure the source.
 */
public class SourceXkcd {
    @JsonProperty("sourceType")
    public SourceXkcdXkcdEnum sourceType;
    public SourceXkcd withSourceType(SourceXkcdXkcdEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}
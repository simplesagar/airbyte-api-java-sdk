/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceWhiskyHunter - The values required to configure the source.
 */
public class SourceWhiskyHunter {
    @JsonProperty("sourceType")
    public SourceWhiskyHunterWhiskyHunterEnum sourceType;
    public SourceWhiskyHunter withSourceType(SourceWhiskyHunterWhiskyHunterEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}

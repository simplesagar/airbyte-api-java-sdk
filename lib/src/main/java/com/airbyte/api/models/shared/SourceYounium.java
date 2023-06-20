/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceYounium - The values required to configure the source.
 */

public class SourceYounium {
    /**
     * Legal Entity that data should be pulled from
     */
    @JsonProperty("legal_entity")
    public String legalEntity;

    public SourceYounium withLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
        return this;
    }
    
    /**
     * Account password for younium account API key
     */
    @JsonProperty("password")
    public String password;

    public SourceYounium withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Property defining if connector is used against playground or production environment
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playground")
    public Boolean playground;

    public SourceYounium withPlayground(Boolean playground) {
        this.playground = playground;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceYouniumYounium sourceType;

    public SourceYounium withSourceType(SourceYouniumYounium sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Username for Younium account
     */
    @JsonProperty("username")
    public String username;

    public SourceYounium withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public SourceYounium(@JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("legal_entity") String legalEntity, @JsonProperty("sourceType") SourceYouniumYounium sourceType) {
        this.username = username;
        this.password = password;
        this.legalEntity = legalEntity;
        this.sourceType = sourceType;
  }
}

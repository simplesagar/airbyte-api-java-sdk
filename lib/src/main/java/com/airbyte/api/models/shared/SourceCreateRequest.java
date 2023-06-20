/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceCreateRequest {
    /**
     * The values required to configure the source.
     */
    @JsonProperty("configuration")
    public Object configuration;

    public SourceCreateRequest withConfiguration(Object configuration) {
        this.configuration = configuration;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public SourceCreateRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Optional secretID obtained through the public API OAuth redirect flow.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secretId")
    public String secretId;

    public SourceCreateRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;

    public SourceCreateRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public SourceCreateRequest(@JsonProperty("configuration") Object configuration, @JsonProperty("name") String name, @JsonProperty("workspaceId") String workspaceId) {
        this.configuration = configuration;
        this.name = name;
        this.workspaceId = workspaceId;
  }
}

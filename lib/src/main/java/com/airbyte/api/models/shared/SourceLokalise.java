/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLokalise - The values required to configure the source.
 */
public class SourceLokalise {
    /**
     * Lokalise API Key with read-access. Available at Profile settings &gt; API tokens. See &lt;a href="https://docs.lokalise.com/en/articles/1929556-api-tokens"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceLokalise withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Lokalise project ID. Available at Project Settings &gt; General.
     */
    @JsonProperty("project_id")
    public String projectId;

    public SourceLokalise withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceLokaliseLokaliseEnum sourceType;

    public SourceLokalise withSourceType(SourceLokaliseLokaliseEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceLokalise(@JsonProperty("api_key") String apiKey, @JsonProperty("project_id") String projectId, @JsonProperty("sourceType") SourceLokaliseLokaliseEnum sourceType) {
        this.apiKey = apiKey;
        this.projectId = projectId;
        this.sourceType = sourceType;
  }
}

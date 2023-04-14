/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkspaceOAuthCredentialsRequest - POST body for creating/updating workspace level OAuth credentials
 */
public class WorkspaceOAuthCredentialsRequest {
    /**
     * Whether you're setting this override for a source or destination
     */
    @JsonProperty("actorType")
    public WorkspaceOAuthCredentialsRequestActorTypeEnum actorType;
    public WorkspaceOAuthCredentialsRequest withActorType(WorkspaceOAuthCredentialsRequestActorTypeEnum actorType) {
        this.actorType = actorType;
        return this;
    }
    
    /**
     * The configuration for this source/destination based on the OAuth section of the relevant specification.
     */
    @JsonProperty("configuration")
    public java.util.Map<String, Object> configuration;
    public WorkspaceOAuthCredentialsRequest withConfiguration(java.util.Map<String, Object> configuration) {
        this.configuration = configuration;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public WorkspaceOAuthCredentialsRequest withName(String name) {
        this.name = name;
        return this;
    }
    
}

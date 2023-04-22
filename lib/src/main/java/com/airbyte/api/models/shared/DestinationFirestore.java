/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationFirestore - The values required to configure the destination.
 */
public class DestinationFirestore {
    /**
     * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.io/integrations/destinations/firestore"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationFirestore withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationFirestoreFirestoreEnum destinationType;
    public DestinationFirestore withDestinationType(DestinationFirestoreFirestoreEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * The GCP project ID for the project containing the target BigQuery dataset.
     */
    @JsonProperty("project_id")
    public String projectId;
    public DestinationFirestore withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    

    public DestinationFirestore(@JsonProperty("destinationType") DestinationFirestoreFirestoreEnum destinationType, @JsonProperty("project_id") String projectId) {
    this.destinationType = destinationType;
this.projectId = projectId;
  }
}

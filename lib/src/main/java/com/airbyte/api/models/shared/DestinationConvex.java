/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationConvex - The values required to configure the destination.
 */
public class DestinationConvex {
    /**
     * API access key used to send data to a Convex deployment.
     */
    @JsonProperty("access_key")
    public String accessKey;
    public DestinationConvex withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    /**
     * URL of the Convex deployment that is the destination
     */
    @JsonProperty("deployment_url")
    public String deploymentUrl;
    public DestinationConvex withDeploymentUrl(String deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationConvexConvexEnum destinationType;
    public DestinationConvex withDestinationType(DestinationConvexConvexEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    

    public DestinationConvex(@JsonProperty("access_key") String accessKey, @JsonProperty("deployment_url") String deploymentUrl, @JsonProperty("destinationType") DestinationConvexConvexEnum destinationType) {
    this.accessKey = accessKey;
this.deploymentUrl = deploymentUrl;
this.destinationType = destinationType;
  }
}

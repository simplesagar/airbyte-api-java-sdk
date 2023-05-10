/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMongodbInstanceTypeMongoDBAtlas - The MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
 */
public class SourceMongodbInstanceTypeMongoDBAtlas {
    /**
     * The URL of a cluster to connect to.
     */
    @JsonProperty("cluster_url")
    public String clusterUrl;

    public SourceMongodbInstanceTypeMongoDBAtlas withClusterUrl(String clusterUrl) {
        this.clusterUrl = clusterUrl;
        return this;
    }
    
    @JsonProperty("instance")
    public SourceMongodbInstanceTypeMongoDBAtlasInstanceEnum instance;

    public SourceMongodbInstanceTypeMongoDBAtlas withInstance(SourceMongodbInstanceTypeMongoDBAtlasInstanceEnum instance) {
        this.instance = instance;
        return this;
    }
    
    public SourceMongodbInstanceTypeMongoDBAtlas(@JsonProperty("cluster_url") String clusterUrl, @JsonProperty("instance") SourceMongodbInstanceTypeMongoDBAtlasInstanceEnum instance) {
        this.clusterUrl = clusterUrl;
        this.instance = instance;
  }
}

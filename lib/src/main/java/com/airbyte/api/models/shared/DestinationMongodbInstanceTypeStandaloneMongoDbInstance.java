/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbInstanceTypeStandaloneMongoDbInstance - MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
 */
public class DestinationMongodbInstanceTypeStandaloneMongoDbInstance {
    /**
     * The Host of a Mongo database to be replicated.
     */
    @JsonProperty("host")
    public String host;

    public DestinationMongodbInstanceTypeStandaloneMongoDbInstance withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonProperty("instance")
    public DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum instance;

    public DestinationMongodbInstanceTypeStandaloneMongoDbInstance withInstance(DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum instance) {
        this.instance = instance;
        return this;
    }
    
    /**
     * The Port of a Mongo database to be replicated.
     */
    @JsonProperty("port")
    public Long port;

    public DestinationMongodbInstanceTypeStandaloneMongoDbInstance withPort(Long port) {
        this.port = port;
        return this;
    }
    
    public DestinationMongodbInstanceTypeStandaloneMongoDbInstance(@JsonProperty("host") String host, @JsonProperty("instance") DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum instance, @JsonProperty("port") Long port) {
        this.host = host;
        this.instance = instance;
        this.port = port;
  }
}

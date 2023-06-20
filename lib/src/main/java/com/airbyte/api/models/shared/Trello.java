/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trello - The values required to configure the source.
 */

public class Trello {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public Trello withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public Trello withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    public Trello(){}
}

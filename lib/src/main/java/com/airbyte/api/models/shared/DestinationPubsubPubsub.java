/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationPubsubPubsub {
    PUBSUB("pubsub");

    @JsonValue
    public final String value;

    private DestinationPubsubPubsub(String value) {
        this.value = value;
    }
}
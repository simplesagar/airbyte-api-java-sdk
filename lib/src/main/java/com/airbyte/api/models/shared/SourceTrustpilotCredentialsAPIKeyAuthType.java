/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceTrustpilotCredentialsAPIKeyAuthType {
    APIKEY("apikey");

    @JsonValue
    public final String value;

    private SourceTrustpilotCredentialsAPIKeyAuthType(String value) {
        this.value = value;
    }
}
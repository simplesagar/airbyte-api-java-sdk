/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceHubspotCredentialsPrivateAppCredentialsEnum - Name of the credentials set
 */
public enum SourceHubspotCredentialsPrivateAppCredentialsEnum {
    PRIVATE_APP_CREDENTIALS("Private App Credentials");

    @JsonValue
    public final String value;

    private SourceHubspotCredentialsPrivateAppCredentialsEnum(String value) {
        this.value = value;
    }
}

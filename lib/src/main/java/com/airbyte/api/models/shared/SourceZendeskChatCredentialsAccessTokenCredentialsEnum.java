/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceZendeskChatCredentialsAccessTokenCredentialsEnum {
    ACCESS_TOKEN("access_token");

    @JsonValue
    public final String value;

    private SourceZendeskChatCredentialsAccessTokenCredentialsEnum(String value) {
        this.value = value;
    }
}

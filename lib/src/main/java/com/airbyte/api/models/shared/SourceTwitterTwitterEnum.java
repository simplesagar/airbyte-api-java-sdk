/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceTwitterTwitterEnum {
    TWITTER("twitter");

    @JsonValue
    public final String value;

    private SourceTwitterTwitterEnum(String value) {
        this.value = value;
    }
}
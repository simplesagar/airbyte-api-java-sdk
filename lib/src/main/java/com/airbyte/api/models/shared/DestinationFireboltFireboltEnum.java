/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationFireboltFireboltEnum {
    FIREBOLT("firebolt");

    @JsonValue
    public final String value;

    private DestinationFireboltFireboltEnum(String value) {
        this.value = value;
    }
}

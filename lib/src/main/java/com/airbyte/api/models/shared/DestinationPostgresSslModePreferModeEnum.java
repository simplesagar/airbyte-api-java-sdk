/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationPostgresSslModePreferModeEnum {
    PREFER("prefer");

    @JsonValue
    public final String value;

    private DestinationPostgresSslModePreferModeEnum(String value) {
        this.value = value;
    }
}
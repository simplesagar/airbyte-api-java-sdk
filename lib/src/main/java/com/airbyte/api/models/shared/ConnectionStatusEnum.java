/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectionStatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive"),
    DEPRECATED("deprecated");

    @JsonValue
    public final String value;

    private ConnectionStatusEnum(String value) {
        this.value = value;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceFakerFakerEnum {
    FAKER("faker");

    @JsonValue
    public final String value;

    private SourceFakerFakerEnum(String value) {
        this.value = value;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceCodaCoda {
    CODA("coda");

    @JsonValue
    public final String value;

    private SourceCodaCoda(String value) {
        this.value = value;
    }
}
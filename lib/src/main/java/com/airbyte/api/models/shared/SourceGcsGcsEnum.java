/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGcsGcsEnum {
    GCS("gcs");

    @JsonValue
    public final String value;

    private SourceGcsGcsEnum(String value) {
        this.value = value;
    }
}

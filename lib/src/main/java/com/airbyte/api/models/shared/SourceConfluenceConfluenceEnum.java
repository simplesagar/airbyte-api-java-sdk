/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceConfluenceConfluenceEnum {
    CONFLUENCE("confluence");

    @JsonValue
    public final String value;

    private SourceConfluenceConfluenceEnum(String value) {
        this.value = value;
    }
}

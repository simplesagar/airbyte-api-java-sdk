/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGoogleSheetsGoogleSheets {
    GOOGLE_SHEETS("google-sheets");

    @JsonValue
    public final String value;

    private SourceGoogleSheetsGoogleSheets(String value) {
        this.value = value;
    }
}
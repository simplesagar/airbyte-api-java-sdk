/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceLinkedinPagesCredentialsOAuth20AuthMethodEnum {
    O_AUTH20("oAuth2.0");

    @JsonValue
    public final String value;

    private SourceLinkedinPagesCredentialsOAuth20AuthMethodEnum(String value) {
        this.value = value;
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceFileSecureProviderHTTPSPublicWebStorage {
    HTTPS("HTTPS");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderHTTPSPublicWebStorage(String value) {
        this.value = value;
    }
}
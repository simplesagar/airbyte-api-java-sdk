/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceShopifyOauthCredentialsOAuth20AuthMethod {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private SourceShopifyOauthCredentialsOAuth20AuthMethod(String value) {
        this.value = value;
    }
}

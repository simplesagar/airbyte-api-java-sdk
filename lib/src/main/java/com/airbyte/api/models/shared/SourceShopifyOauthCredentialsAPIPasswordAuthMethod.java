/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceShopifyOauthCredentialsAPIPasswordAuthMethod {
    API_PASSWORD("api_password");

    @JsonValue
    public final String value;

    private SourceShopifyOauthCredentialsAPIPasswordAuthMethod(String value) {
        this.value = value;
    }
}

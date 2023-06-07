/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethod - Connect through a jump server tunnel host using username and password authentication
 */
public enum SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethod {
    SSH_PASSWORD_AUTH("SSH_PASSWORD_AUTH");

    @JsonValue
    public final String value;

    private SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethod(String value) {
        this.value = value;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod {
    ENCRYPTED_TRUST_SERVER_CERTIFICATE("encrypted_trust_server_certificate");

    @JsonValue
    public final String value;

    private DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod(String value) {
        this.value = value;
    }
}
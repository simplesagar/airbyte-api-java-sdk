/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationSftpJsonSftpJson {
    SFTP_JSON("sftp-json");

    @JsonValue
    public final String value;

    private DestinationSftpJsonSftpJson(String value) {
        this.value = value;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceFaunaCollectionDeletionsEnabledDeletionMode {
    DELETED_FIELD("deleted_field");

    @JsonValue
    public final String value;

    private SourceFaunaCollectionDeletionsEnabledDeletionMode(String value) {
        this.value = value;
    }
}
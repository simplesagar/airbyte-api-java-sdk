/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceTodoistTodoistEnum {
    TODOIST("todoist");

    @JsonValue
    public final String value;

    private SourceTodoistTodoistEnum(String value) {
        this.value = value;
    }
}
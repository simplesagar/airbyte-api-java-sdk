/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationDatabricksDataSourceRecommendedManagedTablesDataSourceType {
    MANAGED_TABLES_STORAGE("MANAGED_TABLES_STORAGE");

    @JsonValue
    public final String value;

    private DestinationDatabricksDataSourceRecommendedManagedTablesDataSourceType(String value) {
        this.value = value;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceXero - The values required to configure the source.
 */
public class SourceXero {
    @JsonProperty("authentication")
    public SourceXeroAuthenticateViaXeroOAuth authentication;

    public SourceXero withAuthentication(SourceXeroAuthenticateViaXeroOAuth authentication) {
        this.authentication = authentication;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceXeroXero sourceType;

    public SourceXero withSourceType(SourceXeroXero sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format YYYY-MM-DDTHH:mm:ssZ. Any data with created_at before this data will not be synced.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceXero withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Enter your Xero organization's Tenant ID
     */
    @JsonProperty("tenant_id")
    public String tenantId;

    public SourceXero withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    
    public SourceXero(@JsonProperty("authentication") SourceXeroAuthenticateViaXeroOAuth authentication, @JsonProperty("sourceType") SourceXeroXero sourceType, @JsonProperty("start_date") OffsetDateTime startDate, @JsonProperty("tenant_id") String tenantId) {
        this.authentication = authentication;
        this.sourceType = sourceType;
        this.startDate = startDate;
        this.tenantId = tenantId;
  }
}

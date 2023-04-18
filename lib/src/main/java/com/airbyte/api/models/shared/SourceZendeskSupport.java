/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceZendeskSupport - The values required to configure the source.
 */
public class SourceZendeskSupport {
    /**
     * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceZendeskSupport withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Makes each stream read a single page of data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ignore_pagination")
    public Boolean ignorePagination;
    public SourceZendeskSupport withIgnorePagination(Boolean ignorePagination) {
        this.ignorePagination = ignorePagination;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceZendeskSupportZendeskSupportEnum sourceType;
    public SourceZendeskSupport withSourceType(SourceZendeskSupportZendeskSupportEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for Zendesk Support API, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceZendeskSupport withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * This is your Zendesk subdomain that can be found in your account URL. For example, in https://{MY_SUBDOMAIN}.zendesk.com/, where MY_SUBDOMAIN is the value of your subdomain.
     */
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceZendeskSupport withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePinterest - The values required to configure the source.
 */
public class SourcePinterest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourcePinterest withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourcePinterestPinterestEnum sourceType;
    public SourcePinterest withSourceType(SourcePinterestPinterestEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (914 days from today).
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourcePinterest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Entity statuses based off of campaigns, ad_groups, and ads. If you do not have a status set, it will be ignored completely.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public SourcePinterestStatusEnum[] status;
    public SourcePinterest withStatus(SourcePinterestStatusEnum[] status) {
        this.status = status;
        return this;
    }
    

    public SourcePinterest(@JsonProperty("sourceType") SourcePinterestPinterestEnum sourceType, @JsonProperty("start_date") String startDate) {
    this.sourceType = sourceType;
this.startDate = startDate;
  }
}

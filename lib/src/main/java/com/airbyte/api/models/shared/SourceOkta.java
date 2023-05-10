/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOkta - The values required to configure the source.
 */
public class SourceOkta {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public SourceOkta withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * The Okta domain. See the &lt;a href="https://docs.airbyte.com/integrations/sources/okta"&gt;docs&lt;/a&gt; for instructions on how to find it.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")
    public String domain;

    public SourceOkta withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceOktaOktaEnum sourceType;

    public SourceOkta withSourceType(SourceOktaOktaEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format YYYY-MM-DDTHH:MM:SSZ. Any data before this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;

    public SourceOkta withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceOkta(@JsonProperty("sourceType") SourceOktaOktaEnum sourceType) {
        this.sourceType = sourceType;
  }
}

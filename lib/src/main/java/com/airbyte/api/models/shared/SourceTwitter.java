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
 * SourceTwitter - The values required to configure the source.
 */
public class SourceTwitter {
    /**
     * App only Bearer Token. See the &lt;a href="https://developer.twitter.com/en/docs/authentication/oauth-2-0/bearer-tokens"&gt;docs&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceTwitter withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The end date for retrieving tweets must be a minimum of 10 seconds prior to the request time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_date")
    public OffsetDateTime endDate;

    public SourceTwitter withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * Query for matching Tweets. You can learn how to build this query by reading &lt;a href="https://developer.twitter.com/en/docs/twitter-api/tweets/search/integrate/build-a-query"&gt; build a query guide &lt;/a&gt;.
     */
    @JsonProperty("query")
    public String query;

    public SourceTwitter withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceTwitterTwitter sourceType;

    public SourceTwitter withSourceType(SourceTwitterTwitter sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The start date for retrieving tweets cannot be more than 7 days in the past.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceTwitter withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceTwitter(@JsonProperty("api_key") String apiKey, @JsonProperty("query") String query, @JsonProperty("sourceType") SourceTwitterTwitter sourceType) {
        this.apiKey = apiKey;
        this.query = query;
        this.sourceType = sourceType;
  }
}

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
 * SourceIntercom - The values required to configure the source.
 */
public class SourceIntercom {
    /**
     * Access token for making authenticated requests. See the &lt;a href="https://developers.intercom.com/building-apps/docs/authentication-types#how-to-get-your-access-token"&gt;Intercom docs&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceIntercom withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceIntercomIntercomEnum sourceType;
    public SourceIntercom withSourceType(SourceIntercomIntercomEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceIntercom withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
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
 * SourceTwilio - The values required to configure the source.
 */
public class SourceTwilio {
    /**
     * Twilio account SID
     */
    @JsonProperty("account_sid")
    public String accountSid;
    public SourceTwilio withAccountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }
    
    /**
     * Twilio Auth Token.
     */
    @JsonProperty("auth_token")
    public String authToken;
    public SourceTwilio withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
    /**
     * How far into the past to look for records. (in minutes)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window")
    public Long lookbackWindow;
    public SourceTwilio withLookbackWindow(Long lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceTwilioTwilioEnum sourceType;
    public SourceTwilio withSourceType(SourceTwilioTwilioEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2020-10-01T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceTwilio withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}

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
 * SourcePaystack - The values required to configure the source.
 */
public class SourcePaystack {
    /**
     * When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window_days")
    public Long lookbackWindowDays;
    public SourcePaystack withLookbackWindowDays(Long lookbackWindowDays) {
        this.lookbackWindowDays = lookbackWindowDays;
        return this;
    }
    
    /**
     * The Paystack API key (usually starts with 'sk_live_'; find yours &lt;a href="https://dashboard.paystack.com/#/settings/developer"&gt;here&lt;/a&gt;).
     */
    @JsonProperty("secret_key")
    public String secretKey;
    public SourcePaystack withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourcePaystackPaystackEnum sourceType;
    public SourcePaystack withSourceType(SourcePaystackPaystackEnum sourceType) {
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
    public SourcePaystack withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}

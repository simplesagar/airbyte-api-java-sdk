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
 * SourceRecharge - The values required to configure the source.
 */
public class SourceRecharge {
    /**
     * The value of the Access Token generated. See the &lt;a href="https://docs.airbyte.com/integrations/sources/recharge"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceRecharge withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceRechargeRechargeEnum sourceType;

    public SourceRecharge withSourceType(SourceRechargeRechargeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for Recharge API, in the format YYYY-MM-DDT00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceRecharge withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceRecharge(@JsonProperty("access_token") String accessToken, @JsonProperty("sourceType") SourceRechargeRechargeEnum sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.accessToken = accessToken;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

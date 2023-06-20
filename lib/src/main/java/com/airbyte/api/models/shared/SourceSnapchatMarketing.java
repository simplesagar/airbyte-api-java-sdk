/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceSnapchatMarketing - The values required to configure the source.
 */

public class SourceSnapchatMarketing {
    /**
     * The Client ID of your Snapchat developer application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceSnapchatMarketing withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Snapchat developer application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceSnapchatMarketing withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Date in the format 2017-01-25. Any data after this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;

    public SourceSnapchatMarketing withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * Refresh Token to renew the expired Access Token.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceSnapchatMarketing withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSnapchatMarketingSnapchatMarketing sourceType;

    public SourceSnapchatMarketing withSourceType(SourceSnapchatMarketingSnapchatMarketing sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Date in the format 2022-01-01. Any data before this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;

    public SourceSnapchatMarketing withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceSnapchatMarketing(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("sourceType") SourceSnapchatMarketingSnapchatMarketing sourceType) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.sourceType = sourceType;
  }
}

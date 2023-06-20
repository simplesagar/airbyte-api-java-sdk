/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GoogleAnalyticsV4 - The values required to configure the source.
 */

public class GoogleAnalyticsV4 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public GoogleAnalyticsV4Credentials credentials;

    public GoogleAnalyticsV4 withCredentials(GoogleAnalyticsV4Credentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    public GoogleAnalyticsV4(){}
}

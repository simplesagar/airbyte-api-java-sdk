/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceAmazonAdsRegion - Region to pull data from (EU/NA/FE). See &lt;a href="https://advertising.amazon.com/API/docs/en-us/info/api-overview#api-endpoints"&gt;docs&lt;/a&gt; for more details.
 */
public enum SourceAmazonAdsRegion {
    NA("NA"),
    EU("EU"),
    FE("FE");

    @JsonValue
    public final String value;

    private SourceAmazonAdsRegion(String value) {
        this.value = value;
    }
}
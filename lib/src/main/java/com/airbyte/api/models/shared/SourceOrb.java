/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOrb - The values required to configure the source.
 */
public class SourceOrb {
    /**
     * Orb API Key, issued from the Orb admin console.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceOrb withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * When set to N, the connector will always refresh resources created within the past N days. By default, updated objects that are not newly created are not incrementally synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window_days")
    public Long lookbackWindowDays;

    public SourceOrb withLookbackWindowDays(Long lookbackWindowDays) {
        this.lookbackWindowDays = lookbackWindowDays;
        return this;
    }
    
    /**
     * Property key names to extract from all events, in order to enrich ledger entries corresponding to an event deduction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numeric_event_properties_keys")
    public String[] numericEventPropertiesKeys;

    public SourceOrb withNumericEventPropertiesKeys(String[] numericEventPropertiesKeys) {
        this.numericEventPropertiesKeys = numericEventPropertiesKeys;
        return this;
    }
    
    /**
     * Orb Plan ID to filter subscriptions that should have usage fetched.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("plan_id")
    public String planId;

    public SourceOrb withPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceOrbOrbEnum sourceType;

    public SourceOrb withSourceType(SourceOrbOrbEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2022-03-01T00:00:00Z. Any data with created_at before this data will not be synced. For Subscription Usage, this becomes the `timeframe_start` API parameter.
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceOrb withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Property key names to extract from all events, in order to enrich ledger entries corresponding to an event deduction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("string_event_properties_keys")
    public String[] stringEventPropertiesKeys;

    public SourceOrb withStringEventPropertiesKeys(String[] stringEventPropertiesKeys) {
        this.stringEventPropertiesKeys = stringEventPropertiesKeys;
        return this;
    }
    
    /**
     * Property key name to group subscription usage by.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subscription_usage_grouping_key")
    public String subscriptionUsageGroupingKey;

    public SourceOrb withSubscriptionUsageGroupingKey(String subscriptionUsageGroupingKey) {
        this.subscriptionUsageGroupingKey = subscriptionUsageGroupingKey;
        return this;
    }
    
    public SourceOrb(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceOrbOrbEnum sourceType, @JsonProperty("start_date") String startDate) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

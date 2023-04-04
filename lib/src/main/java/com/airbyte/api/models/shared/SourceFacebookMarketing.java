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
 * SourceFacebookMarketing - The values required to configure the source.
 */
public class SourceFacebookMarketing {
    /**
     * The value of the access token generated. See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceFacebookMarketing withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * The Facebook Ad account ID to use when pulling data from the Facebook Marketing API.
     */
    @JsonProperty("account_id")
    public String accountId;
    public SourceFacebookMarketing withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * Allows action_breakdowns to be an empty list
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_breakdowns_allow_empty")
    public Boolean actionBreakdownsAllowEmpty;
    public SourceFacebookMarketing withActionBreakdownsAllowEmpty(Boolean actionBreakdownsAllowEmpty) {
        this.actionBreakdownsAllowEmpty = actionBreakdownsAllowEmpty;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceFacebookMarketingFacebookMarketingEnum airbyteSourceName;
    public SourceFacebookMarketing withAirbyteSourceName(SourceFacebookMarketingFacebookMarketingEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * A list which contains insights entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_insights")
    public SourceFacebookMarketingInsightConfig[] customInsights;
    public SourceFacebookMarketing withCustomInsights(SourceFacebookMarketingInsightConfig[] customInsights) {
        this.customInsights = customInsights;
        return this;
    }
    
    /**
     * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the latest data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceFacebookMarketing withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * In each Ad Creative, fetch the thumbnail_url and store the result in thumbnail_data_url
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fetch_thumbnail_images")
    public Boolean fetchThumbnailImages;
    public SourceFacebookMarketing withFetchThumbnailImages(Boolean fetchThumbnailImages) {
        this.fetchThumbnailImages = fetchThumbnailImages;
        return this;
    }
    
    /**
     * Include data from deleted Campaigns, Ads, and AdSets
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_deleted")
    public Boolean includeDeleted;
    public SourceFacebookMarketing withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    
    /**
     * The attribution window
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("insights_lookback_window")
    public Long insightsLookbackWindow;
    public SourceFacebookMarketing withInsightsLookbackWindow(Long insightsLookbackWindow) {
        this.insightsLookbackWindow = insightsLookbackWindow;
        return this;
    }
    
    /**
     * Maximum batch size used when sending batch requests to Facebook API. Most users do not need to set this field unless they specifically need to tune the connector to address specific issues or use cases.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_batch_size")
    public Long maxBatchSize;
    public SourceFacebookMarketing withMaxBatchSize(Long maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
        return this;
    }
    
    /**
     * Page size used when sending requests to Facebook API to specify number of records per page when response has pagination. Most users do not need to set this field unless they specifically need to tune the connector to address specific issues or use cases.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size")
    public Long pageSize;
    public SourceFacebookMarketing withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceFacebookMarketing withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
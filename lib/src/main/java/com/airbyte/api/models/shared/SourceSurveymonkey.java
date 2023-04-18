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
 * SourceSurveymonkey - The values required to configure the source.
 */
public class SourceSurveymonkey {
    /**
     * The authorization method to use to retrieve data from SurveyMonkey
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod credentials;
    public SourceSurveymonkey withCredentials(SourceSurveymonkeySurveyMonkeyAuthorizationMethod credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("origin")
    public SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum origin;
    public SourceSurveymonkey withOrigin(SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum origin) {
        this.origin = origin;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSurveymonkeySurveymonkeyEnum sourceType;
    public SourceSurveymonkey withSourceType(SourceSurveymonkeySurveymonkeyEnum sourceType) {
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
    public SourceSurveymonkey withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all boards to which you have access will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_ids")
    public String[] surveyIds;
    public SourceSurveymonkey withSurveyIds(String[] surveyIds) {
        this.surveyIds = surveyIds;
        return this;
    }
    
}

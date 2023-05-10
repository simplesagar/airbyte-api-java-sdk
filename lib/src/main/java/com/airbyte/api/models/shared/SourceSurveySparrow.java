/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSurveySparrow - The values required to configure the source.
 */
public class SourceSurveySparrow {
    /**
     * Your access token. See &lt;a href="https://developers.surveysparrow.com/rest-apis#authentication"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceSurveySparrow withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * Is your account location is EU based? If yes, the base url to retrieve data will be different.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public Object region;

    public SourceSurveySparrow withRegion(Object region) {
        this.region = region;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSurveySparrowSurveySparrowEnum sourceType;

    public SourceSurveySparrow withSourceType(SourceSurveySparrowSurveySparrowEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * A List of your survey ids for survey-specific stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_id")
    public Object[] surveyId;

    public SourceSurveySparrow withSurveyId(Object[] surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    
    public SourceSurveySparrow(@JsonProperty("access_token") String accessToken, @JsonProperty("sourceType") SourceSurveySparrowSurveySparrowEnum sourceType) {
        this.accessToken = accessToken;
        this.sourceType = sourceType;
  }
}

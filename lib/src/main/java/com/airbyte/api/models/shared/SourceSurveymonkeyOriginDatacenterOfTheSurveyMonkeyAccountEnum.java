/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum - Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
 */
public enum SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum {
    USA("USA"),
    EUROPE("Europe"),
    CANADA("Canada");

    @JsonValue
    public final String value;

    private SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum(String value) {
        this.value = value;
    }
}
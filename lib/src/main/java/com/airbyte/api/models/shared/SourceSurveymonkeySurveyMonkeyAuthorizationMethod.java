/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSurveymonkeySurveyMonkeyAuthorizationMethod - The authorization method to use to retrieve data from SurveyMonkey
 */
public class SourceSurveymonkeySurveyMonkeyAuthorizationMethod {
    /**
     * Access Token for making authenticated requests. See the &lt;a href="https://docs.airbyte.io/integrations/sources/surveymonkey"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethod authMethod;

    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withAuthMethod(SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    /**
     * The Client ID of the SurveyMonkey developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of the SurveyMonkey developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod(@JsonProperty("access_token") String accessToken, @JsonProperty("auth_method") SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethod authMethod) {
        this.accessToken = accessToken;
        this.authMethod = authMethod;
  }
}

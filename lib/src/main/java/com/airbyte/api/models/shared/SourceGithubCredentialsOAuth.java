/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGithubCredentialsOAuth - Choose how to authenticate to GitHub
 */
public class SourceGithubCredentialsOAuth {
    /**
     * OAuth access token
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceGithubCredentialsOAuth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceGithubCredentialsOAuthOptionTitleEnum optionTitle;

    public SourceGithubCredentialsOAuth withOptionTitle(SourceGithubCredentialsOAuthOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    public SourceGithubCredentialsOAuth(@JsonProperty("access_token") String accessToken) {
        this.accessToken = accessToken;
  }
}

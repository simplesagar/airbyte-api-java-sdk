/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleWorkspaceAdminReports - The values required to configure the source.
 */
public class SourceGoogleWorkspaceAdminReports {
    /**
     * The contents of the JSON service account key. See the &lt;a href="https://developers.google.com/admin-sdk/reports/v1/guides/delegation"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonProperty("credentials_json")
    public String credentialsJson;

    public SourceGoogleWorkspaceAdminReports withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    /**
     * The email of the user, which has permissions to access the Google Workspace Admin APIs.
     */
    @JsonProperty("email")
    public String email;

    public SourceGoogleWorkspaceAdminReports withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * Sets the range of time shown in the report. Reports API allows from up to 180 days ago. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback")
    public Long lookback;

    public SourceGoogleWorkspaceAdminReports withLookback(Long lookback) {
        this.lookback = lookback;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum sourceType;

    public SourceGoogleWorkspaceAdminReports withSourceType(SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceGoogleWorkspaceAdminReports(@JsonProperty("credentials_json") String credentialsJson, @JsonProperty("email") String email, @JsonProperty("sourceType") SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum sourceType) {
        this.credentialsJson = credentialsJson;
        this.email = email;
        this.sourceType = sourceType;
  }
}

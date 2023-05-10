/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft - Choose how to authenticate to Microsoft
 */
public class SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthTypeEnum authType;

    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withAuthType(SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your Microsoft Teams developer application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Microsoft Teams developer application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the \u2026 next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
     */
    @JsonProperty("tenant_id")
    public String tenantId;

    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("tenant_id") String tenantId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.tenantId = tenantId;
  }
}

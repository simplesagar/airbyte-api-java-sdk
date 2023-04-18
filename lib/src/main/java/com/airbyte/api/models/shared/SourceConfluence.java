/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceConfluence - The values required to configure the source.
 */
public class SourceConfluence {
    /**
     * Please follow the Jira confluence for generating an API token: &lt;a href="https://support.atlassian.com/atlassian-account/docs/manage-api-tokens-for-your-atlassian-account/"&gt;generating an API token&lt;/a&gt;.
     */
    @JsonProperty("api_token")
    public String apiToken;
    public SourceConfluence withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    /**
     * Your Confluence domain name
     */
    @JsonProperty("domain_name")
    public String domainName;
    public SourceConfluence withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    /**
     * Your Confluence login email
     */
    @JsonProperty("email")
    public String email;
    public SourceConfluence withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceConfluenceConfluenceEnum sourceType;
    public SourceConfluence withSourceType(SourceConfluenceConfluenceEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}

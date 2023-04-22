/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSmartsheetsCredentialsAPIAccessToken {
    /**
     * The access token to use for accessing your data from Smartsheets. This access token must be generated by a user with at least read access to the data you'd like to replicate. Generate an access token in the Smartsheets main menu by clicking Account &gt; Apps &amp; Integrations &gt; API Access. See the &lt;a href="https://docs.airbyte.com/integrations/sources/smartsheets/#setup-guide"&gt;setup guide&lt;/a&gt; for information on how to obtain this token.
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceSmartsheetsCredentialsAPIAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceSmartsheetsCredentialsAPIAccessTokenAuthTypeEnum authType;
    public SourceSmartsheetsCredentialsAPIAccessToken withAuthType(SourceSmartsheetsCredentialsAPIAccessTokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    

    public SourceSmartsheetsCredentialsAPIAccessToken(@JsonProperty("access_token") String accessToken) {
    this.accessToken = accessToken;
  }
}

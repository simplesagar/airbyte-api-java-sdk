/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce - The values required to configure the source.
 */

public class Salesforce {
    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client ID&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public Salesforce withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client secret&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public Salesforce withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    public Salesforce(){}
}

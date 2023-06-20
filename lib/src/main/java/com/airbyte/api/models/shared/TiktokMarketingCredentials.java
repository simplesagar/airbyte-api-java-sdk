/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TiktokMarketingCredentials {
    /**
     * The Developer Application App ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_id")
    public String appId;

    public TiktokMarketingCredentials withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * The Developer Application Secret.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret")
    public String secret;

    public TiktokMarketingCredentials withSecret(String secret) {
        this.secret = secret;
        return this;
    }
    
    public TiktokMarketingCredentials(){}
}

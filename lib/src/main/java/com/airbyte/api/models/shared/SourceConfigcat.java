/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceConfigcat - The values required to configure the source.
 */
public class SourceConfigcat {
    /**
     * Basic auth password. See &lt;a href="https://api.configcat.com/docs/#section/Authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("password")
    public String password;
    public SourceConfigcat withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceConfigcatConfigcatEnum sourceType;
    public SourceConfigcat withSourceType(SourceConfigcatConfigcatEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Basic auth user name. See &lt;a href="https://api.configcat.com/docs/#section/Authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("username")
    public String username;
    public SourceConfigcat withUsername(String username) {
        this.username = username;
        return this;
    }
    
}

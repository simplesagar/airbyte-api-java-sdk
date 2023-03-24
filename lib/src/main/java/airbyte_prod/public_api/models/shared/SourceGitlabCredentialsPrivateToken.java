/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGitlabCredentialsPrivateToken {
    /**
     * Log into your Gitlab account and then generate a personal Access Token.
     */
    @JsonProperty("access_token")public String accessToken;
    public SourceGitlabCredentialsPrivateToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")public SourceGitlabCredentialsPrivateTokenAuthTypeEnum authType;
    public SourceGitlabCredentialsPrivateToken withAuthType(SourceGitlabCredentialsPrivateTokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}

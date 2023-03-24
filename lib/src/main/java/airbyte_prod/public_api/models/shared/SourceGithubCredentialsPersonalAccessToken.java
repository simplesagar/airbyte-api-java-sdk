/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGithubCredentialsPersonalAccessToken - Choose how to authenticate to GitHub
 */
public class SourceGithubCredentialsPersonalAccessToken {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")public SourceGithubCredentialsPersonalAccessTokenOptionTitleEnum optionTitle;
    public SourceGithubCredentialsPersonalAccessToken withOptionTitle(SourceGithubCredentialsPersonalAccessTokenOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    /**
     * Log into GitHub and then generate a <a href="https://github.com/settings/tokens">personal access token</a>. To load balance your API quota consumption across multiple API tokens, input multiple tokens separated with ","
     */
    @JsonProperty("personal_access_token")public String personalAccessToken;
    public SourceGithubCredentialsPersonalAccessToken withPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }
    
}

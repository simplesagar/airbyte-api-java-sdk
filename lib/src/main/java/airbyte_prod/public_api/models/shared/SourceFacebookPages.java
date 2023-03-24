/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFacebookPages - The values required to configure the source.
 */
public class SourceFacebookPages {
    /**
     * Facebook Page Access Token
     */
    @JsonProperty("access_token")public String accessToken;
    public SourceFacebookPages withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")public SourceFacebookPagesFacebookPagesEnum airbyteSourceName;
    public SourceFacebookPages withAirbyteSourceName(SourceFacebookPagesFacebookPagesEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Page ID
     */
    @JsonProperty("page_id")public String pageId;
    public SourceFacebookPages withPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    
}

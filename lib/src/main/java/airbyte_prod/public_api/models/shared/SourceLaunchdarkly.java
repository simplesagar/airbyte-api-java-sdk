/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLaunchdarkly - The values required to configure the source.
 */
public class SourceLaunchdarkly {
    /**
     * Your Access token. See <a href="https://apidocs.launchdarkly.com/#section/Overview/Authentication">here</a>.
     */
    @JsonProperty("access_token")public String accessToken;
    public SourceLaunchdarkly withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")public SourceLaunchdarklyLaunchdarklyEnum airbyteSourceName;
    public SourceLaunchdarkly withAirbyteSourceName(SourceLaunchdarklyLaunchdarklyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
}

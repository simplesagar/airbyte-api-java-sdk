/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceIp2whois - The values required to configure the source.
 */
public class SourceIp2whois {
    @JsonProperty("airbyte-source-name")public SourceIp2whoisIp2whoisEnum airbyteSourceName;
    public SourceIp2whois withAirbyteSourceName(SourceIp2whoisIp2whoisEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Your API Key. See <a href="https://www.ip2whois.com/developers-api">here</a>.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_key")public String apiKey;
    public SourceIp2whois withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Domain name. See <a href="https://www.ip2whois.com/developers-api">here</a>.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")public String domain;
    public SourceIp2whois withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
}
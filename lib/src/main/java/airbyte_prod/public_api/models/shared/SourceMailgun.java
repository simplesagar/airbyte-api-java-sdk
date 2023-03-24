/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import airbyte_prod.public_api.utils.DateTimeDeserializer;
import airbyte_prod.public_api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceMailgun - The values required to configure the source.
 */
public class SourceMailgun {
    @JsonProperty("airbyte-source-name")public SourceMailgunMailgunEnum airbyteSourceName;
    public SourceMailgun withAirbyteSourceName(SourceMailgunMailgunEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Domain region code. 'EU' or 'US' are possible values. The default is 'US'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain_region")public String domainRegion;
    public SourceMailgun withDomainRegion(String domainRegion) {
        this.domainRegion = domainRegion;
        return this;
    }
    
    /**
     * Primary account API key to access your Mailgun data.
     */
    @JsonProperty("private_key")public String privateKey;
    public SourceMailgun withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    
    /**
     * UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")public OffsetDateTime startDate;
    public SourceMailgun withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}

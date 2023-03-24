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
 * SourceCloseCom - The values required to configure the source.
 */
public class SourceCloseCom {
    @JsonProperty("airbyte-source-name")public SourceCloseComCloseComEnum airbyteSourceName;
    public SourceCloseCom withAirbyteSourceName(SourceCloseComCloseComEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Close.com API key (usually starts with 'api_'; find yours <a href="https://app.close.com/settings/api/">here</a>).
     */
    @JsonProperty("api_key")public String apiKey;
    public SourceCloseCom withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The start date to sync data. Leave blank for full sync. Format: YYYY-MM-DD.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")public OffsetDateTime startDate;
    public SourceCloseCom withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}

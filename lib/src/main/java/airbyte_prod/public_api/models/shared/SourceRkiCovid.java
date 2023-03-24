/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRkiCovid - The values required to configure the source.
 */
public class SourceRkiCovid {
    @JsonProperty("airbyte-source-name")public SourceRkiCovidRkiCovidEnum airbyteSourceName;
    public SourceRkiCovid withAirbyteSourceName(SourceRkiCovidRkiCovidEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * UTC date in the format 2017-01-25. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")public String startDate;
    public SourceRkiCovid withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}

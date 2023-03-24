/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTypeform - The values required to configure the source.
 */
public class SourceTypeform {
    @JsonProperty("airbyte-source-name")public SourceTypeformTypeformEnum airbyteSourceName;
    public SourceTypeform withAirbyteSourceName(SourceTypeformTypeformEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * When this parameter is set, the connector will replicate data only from the input forms. Otherwise, all forms in your Typeform account will be replicated. You can find form IDs in your form URLs. For example, in the URL "https://mysite.typeform.com/to/u6nXL7" the form_id is u6nXL7. You can find form URLs on Share panel
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("form_ids")public String[] formIds;
    public SourceTypeform withFormIds(String[] formIds) {
        this.formIds = formIds;
        return this;
    }
    
    /**
     * UTC date and time in the format: YYYY-MM-DDTHH:mm:ss[Z]. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")public String startDate;
    public SourceTypeform withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * The API Token for a Typeform account.
     */
    @JsonProperty("token")public String token;
    public SourceTypeform withToken(String token) {
        this.token = token;
        return this;
    }
    
}

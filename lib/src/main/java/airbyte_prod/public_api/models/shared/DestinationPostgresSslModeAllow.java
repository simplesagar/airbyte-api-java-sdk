/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModeAllow - Allow SSL mode.
 */
public class DestinationPostgresSslModeAllow {
    @JsonProperty("mode")public DestinationPostgresSslModeAllowModeEnum mode;
    public DestinationPostgresSslModeAllow withMode(DestinationPostgresSslModeAllowModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}

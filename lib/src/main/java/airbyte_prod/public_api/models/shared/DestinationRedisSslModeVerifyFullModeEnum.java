/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationRedisSslModeVerifyFullModeEnum {
    VERIFY_FULL("verify-full");

    @JsonValue
    public final String value;

    private DestinationRedisSslModeVerifyFullModeEnum(String value) {
        this.value = value;
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceRetentlyRetentlyEnum {
    RETENTLY("retently");

    @JsonValue
    public final String value;

    private SourceRetentlyRetentlyEnum(String value) {
        this.value = value;
    }
}

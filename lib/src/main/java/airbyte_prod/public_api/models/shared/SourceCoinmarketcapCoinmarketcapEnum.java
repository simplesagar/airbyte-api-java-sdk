/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceCoinmarketcapCoinmarketcapEnum {
    COINMARKETCAP("coinmarketcap");

    @JsonValue
    public final String value;

    private SourceCoinmarketcapCoinmarketcapEnum(String value) {
        this.value = value;
    }
}

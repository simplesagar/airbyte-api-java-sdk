/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceLinkedinAdsLinkedinAdsEnum {
    LINKEDIN_ADS("linkedin-ads");

    @JsonValue
    public final String value;

    private SourceLinkedinAdsLinkedinAdsEnum(String value) {
        this.value = value;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationS3S3Enum {
    S3("s3");

    @JsonValue
    public final String value;

    private DestinationS3S3Enum(String value) {
        this.value = value;
    }
}

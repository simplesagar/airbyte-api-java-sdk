/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceFileSecureProviderS3AmazonWebServicesStorageEnum {
    S3("S3");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderS3AmazonWebServicesStorageEnum(String value) {
        this.value = value;
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum - PAT Credentials
 */
public enum SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum {
    PAT_CREDENTIALS("PAT Credentials");

    @JsonValue
    public final String value;

    private SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum(String value) {
        this.value = value;
    }
}

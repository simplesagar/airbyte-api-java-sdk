/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceHubspotCredentialsOAuthCredentialsEnum - Name of the credentials
 */
public enum SourceHubspotCredentialsOAuthCredentialsEnum {
    O_AUTH_CREDENTIALS("OAuth Credentials");

    @JsonValue
    public final String value;

    private SourceHubspotCredentialsOAuthCredentialsEnum(String value) {
        this.value = value;
    }
}

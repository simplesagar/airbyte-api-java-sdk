/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceAuth0Auth0Enum {
    AUTH0("auth0");

    @JsonValue
    public final String value;

    private SourceAuth0Auth0Enum(String value) {
        this.value = value;
    }
}

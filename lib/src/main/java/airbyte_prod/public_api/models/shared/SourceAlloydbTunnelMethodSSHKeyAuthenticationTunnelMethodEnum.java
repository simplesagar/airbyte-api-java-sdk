/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceAlloydbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum - Connect through a jump server tunnel host using username and ssh key
 */
public enum SourceAlloydbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    public final String value;

    private SourceAlloydbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum(String value) {
        this.value = value;
    }
}

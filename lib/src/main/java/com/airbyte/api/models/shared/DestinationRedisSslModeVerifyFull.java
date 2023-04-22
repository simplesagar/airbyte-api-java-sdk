/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedisSslModeVerifyFull - Verify-full SSL mode.
 */
public class DestinationRedisSslModeVerifyFull {
    /**
     * CA certificate
     */
    @JsonProperty("ca_certificate")
    public String caCertificate;
    public DestinationRedisSslModeVerifyFull withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    
    /**
     * Client certificate
     */
    @JsonProperty("client_certificate")
    public String clientCertificate;
    public DestinationRedisSslModeVerifyFull withClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }
    
    /**
     * Client key
     */
    @JsonProperty("client_key")
    public String clientKey;
    public DestinationRedisSslModeVerifyFull withClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    
    /**
     * Password for keystorage. If you do not add it - the password will be generated automatically.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    public String clientKeyPassword;
    public DestinationRedisSslModeVerifyFull withClientKeyPassword(String clientKeyPassword) {
        this.clientKeyPassword = clientKeyPassword;
        return this;
    }
    
    @JsonProperty("mode")
    public DestinationRedisSslModeVerifyFullModeEnum mode;
    public DestinationRedisSslModeVerifyFull withMode(DestinationRedisSslModeVerifyFullModeEnum mode) {
        this.mode = mode;
        return this;
    }
    

    public DestinationRedisSslModeVerifyFull(@JsonProperty("ca_certificate") String caCertificate, @JsonProperty("client_certificate") String clientCertificate, @JsonProperty("client_key") String clientKey, @JsonProperty("mode") DestinationRedisSslModeVerifyFullModeEnum mode) {
    this.caCertificate = caCertificate;
this.clientCertificate = clientCertificate;
this.clientKey = clientKey;
this.mode = mode;
  }
}

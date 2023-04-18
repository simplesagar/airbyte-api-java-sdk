/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey - An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys"&gt;here&lt;/a&gt;.
 */
public class DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey {
    @JsonProperty("credential_type")
    public DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum credentialType;
    public DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey withCredentialType(DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    
    /**
     * HMAC key access ID. When linked to a service account, this ID is 61 characters long; when linked to a user account, it is 24 characters long.
     */
    @JsonProperty("hmac_key_access_id")
    public String hmacKeyAccessId;
    public DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey withHmacKeyAccessId(String hmacKeyAccessId) {
        this.hmacKeyAccessId = hmacKeyAccessId;
        return this;
    }
    
    /**
     * The corresponding secret for the access ID. It is a 40-character base-64 encoded string.
     */
    @JsonProperty("hmac_key_secret")
    public String hmacKeySecret;
    public DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey withHmacKeySecret(String hmacKeySecret) {
        this.hmacKeySecret = hmacKeySecret;
        return this;
    }
    
}

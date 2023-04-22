/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceBraintree - The values required to configure the source.
 */
public class SourceBraintree {
    /**
     * Environment specifies where the data will come from.
     */
    @JsonProperty("environment")
    public SourceBraintreeEnvironmentEnum environment;
    public SourceBraintree withEnvironment(SourceBraintreeEnvironmentEnum environment) {
        this.environment = environment;
        return this;
    }
    
    /**
     * The unique identifier for your entire gateway account. See the &lt;a href="https://docs.airbyte.com/integrations/sources/braintree"&gt;docs&lt;/a&gt; for more information on how to obtain this ID.
     */
    @JsonProperty("merchant_id")
    public String merchantId;
    public SourceBraintree withMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    
    /**
     * Braintree Private Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/braintree"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("private_key")
    public String privateKey;
    public SourceBraintree withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    
    /**
     * Braintree Public Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/braintree"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("public_key")
    public String publicKey;
    public SourceBraintree withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceBraintreeBraintreeEnum sourceType;
    public SourceBraintree withSourceType(SourceBraintreeBraintreeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceBraintree withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    

    public SourceBraintree(@JsonProperty("environment") SourceBraintreeEnvironmentEnum environment, @JsonProperty("merchant_id") String merchantId, @JsonProperty("private_key") String privateKey, @JsonProperty("public_key") String publicKey, @JsonProperty("sourceType") SourceBraintreeBraintreeEnum sourceType) {
    this.environment = environment;
this.merchantId = merchantId;
this.privateKey = privateKey;
this.publicKey = publicKey;
this.sourceType = sourceType;
  }
}

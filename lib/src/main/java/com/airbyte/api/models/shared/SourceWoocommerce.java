/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceWoocommerce - The values required to configure the source.
 */
public class SourceWoocommerce {
    /**
     * Customer Key for API in WooCommerce shop
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceWoocommerce withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Customer Secret for API in WooCommerce shop
     */
    @JsonProperty("api_secret")
    public String apiSecret;

    public SourceWoocommerce withApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }
    
    /**
     * The name of the store. For https://EXAMPLE.com, the shop name is 'EXAMPLE.com'.
     */
    @JsonProperty("shop")
    public String shop;

    public SourceWoocommerce withShop(String shop) {
        this.shop = shop;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceWoocommerceWoocommerce sourceType;

    public SourceWoocommerce withSourceType(SourceWoocommerceWoocommerce sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date you would like to replicate data from. Format: YYYY-MM-DD
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;

    public SourceWoocommerce withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceWoocommerce(@JsonProperty("api_key") String apiKey, @JsonProperty("api_secret") String apiSecret, @JsonProperty("shop") String shop, @JsonProperty("sourceType") SourceWoocommerceWoocommerce sourceType, @JsonProperty("start_date") LocalDate startDate) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.shop = shop;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

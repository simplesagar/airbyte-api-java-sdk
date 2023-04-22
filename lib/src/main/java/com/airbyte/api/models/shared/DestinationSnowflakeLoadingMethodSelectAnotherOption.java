/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodSelectAnotherOption - Select another option
 */
public class DestinationSnowflakeLoadingMethodSelectAnotherOption {
    @JsonProperty("method")
    public DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum method;
    public DestinationSnowflakeLoadingMethodSelectAnotherOption withMethod(DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum method) {
        this.method = method;
        return this;
    }
    

    public DestinationSnowflakeLoadingMethodSelectAnotherOption(@JsonProperty("method") DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum method) {
    this.method = method;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetDestinationRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=destinationId")
    public String destinationId;

    public GetDestinationRequest withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    public GetDestinationRequest(@JsonProperty("destinationId") String destinationId) {
        this.destinationId = destinationId;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetStreamPropertiesRequest {
    /**
     * ID of the destination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=destinationId")
    public String destinationId;
    public GetStreamPropertiesRequest withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    /**
     * ID of the source
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sourceId")
    public String sourceId;
    public GetStreamPropertiesRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    

    public GetStreamPropertiesRequest(@JsonProperty("destinationId") String destinationId, @JsonProperty("sourceId") String sourceId) {
    this.destinationId = destinationId;
this.sourceId = sourceId;
  }
}

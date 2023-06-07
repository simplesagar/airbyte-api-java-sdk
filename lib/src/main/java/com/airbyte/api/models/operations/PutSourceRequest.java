/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PutSourceRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.airbyte.api.models.shared.SourcePutRequest sourcePutRequest;

    public PutSourceRequest withSourcePutRequest(com.airbyte.api.models.shared.SourcePutRequest sourcePutRequest) {
        this.sourcePutRequest = sourcePutRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sourceId")
    public String sourceId;

    public PutSourceRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    public PutSourceRequest(@JsonProperty("sourceId") String sourceId) {
        this.sourceId = sourceId;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetSourceResponse {
    
    public String contentType;

    public GetSourceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Get a Source by the id in the path.
     */
    
    public com.airbyte.api.models.shared.SourceResponse sourceResponse;

    public GetSourceResponse withSourceResponse(com.airbyte.api.models.shared.SourceResponse sourceResponse) {
        this.sourceResponse = sourceResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetSourceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetSourceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetSourceResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}

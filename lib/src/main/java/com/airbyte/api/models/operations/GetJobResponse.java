/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetJobResponse {
    
    public String contentType;
    public GetJobResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Get a Job by the id in the path.
     */
    
    public com.airbyte.api.models.shared.JobResponse jobResponse;
    public GetJobResponse withJobResponse(com.airbyte.api.models.shared.JobResponse jobResponse) {
        this.jobResponse = jobResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetJobResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetJobResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    

    public GetJobResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}

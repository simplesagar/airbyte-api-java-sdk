/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.api.models.operations;

import java.net.http.HttpResponse;

public class GetStreamPropertiesResponse {
    
    public String contentType;
    public GetStreamPropertiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetStreamPropertiesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetStreamPropertiesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Get the available streams properties for a source/destination pair.
     */
    
    public airbyte_prod.api.models.shared.StreamProperties streamProperties;
    public GetStreamPropertiesResponse withStreamProperties(airbyte_prod.api.models.shared.StreamProperties streamProperties) {
        this.streamProperties = streamProperties;
        return this;
    }
    
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.api;

import airbyte_prod.api.utils.HTTPClient;
import airbyte_prod.api.utils.HTTPRequest;
import airbyte_prod.api.utils.JSON;
import airbyte_prod.api.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Destinations {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Destinations(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Create a destination
     * Creates a destination given a name, workspace id, and a json blob containing the configuration for the source.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public airbyte_prod.api.models.operations.CreateDestinationResponse createDestination(airbyte_prod.api.models.shared.DestinationCreateRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = airbyte_prod.api.utils.Utils.generateURL(baseUrl, "/destinations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = airbyte_prod.api.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        airbyte_prod.api.models.operations.CreateDestinationResponse res = new airbyte_prod.api.models.operations.CreateDestinationResponse() {{
            destinationResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (airbyte_prod.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                airbyte_prod.api.models.shared.DestinationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), airbyte_prod.api.models.shared.DestinationResponse.class);
                res.destinationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Delete a Destination
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public airbyte_prod.api.models.operations.DeleteDestinationResponse deleteDestination(airbyte_prod.api.models.operations.DeleteDestinationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = airbyte_prod.api.utils.Utils.generateURL(airbyte_prod.api.models.operations.DeleteDestinationRequest.class, baseUrl, "/destinations/{destinationId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        airbyte_prod.api.models.operations.DeleteDestinationResponse res = new airbyte_prod.api.models.operations.DeleteDestinationResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Get Destination details
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public airbyte_prod.api.models.operations.GetDestinationResponse getDestination(airbyte_prod.api.models.operations.GetDestinationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = airbyte_prod.api.utils.Utils.generateURL(airbyte_prod.api.models.operations.GetDestinationRequest.class, baseUrl, "/destinations/{destinationId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        airbyte_prod.api.models.operations.GetDestinationResponse res = new airbyte_prod.api.models.operations.GetDestinationResponse() {{
            destinationResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (airbyte_prod.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                airbyte_prod.api.models.shared.DestinationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), airbyte_prod.api.models.shared.DestinationResponse.class);
                res.destinationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * List destinations
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public airbyte_prod.api.models.operations.ListDestinationsResponse listDestinations(airbyte_prod.api.models.operations.ListDestinationsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = airbyte_prod.api.utils.Utils.generateURL(baseUrl, "/destinations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = airbyte_prod.api.utils.Utils.getQueryParams(airbyte_prod.api.models.operations.ListDestinationsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        airbyte_prod.api.models.operations.ListDestinationsResponse res = new airbyte_prod.api.models.operations.ListDestinationsResponse() {{
            destinationsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (airbyte_prod.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                airbyte_prod.api.models.shared.DestinationsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), airbyte_prod.api.models.shared.DestinationsResponse.class);
                res.destinationsResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }
}
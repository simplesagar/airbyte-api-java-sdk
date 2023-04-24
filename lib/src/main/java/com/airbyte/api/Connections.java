/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.HTTPRequest;
import com.airbyte.api.utils.JSON;
import com.airbyte.api.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Connections {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Connections(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Create a connection
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.CreateConnectionResponse createConnection(com.airbyte.api.models.shared.ConnectionCreateRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/connections");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.CreateConnectionResponse res = new com.airbyte.api.models.operations.CreateConnectionResponse(contentType, httpRes.statusCode()) {{
            connectionResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.ConnectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.ConnectionResponse.class);
                res.connectionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
        }

        return res;
    }

    /**
     * Delete a Connection
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.DeleteConnectionResponse deleteConnection(com.airbyte.api.models.operations.DeleteConnectionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.DeleteConnectionRequest.class, baseUrl, "/connections/{connectionId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.DeleteConnectionResponse res = new com.airbyte.api.models.operations.DeleteConnectionResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Get Connection details
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.GetConnectionResponse getConnection(com.airbyte.api.models.operations.GetConnectionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.GetConnectionRequest.class, baseUrl, "/connections/{connectionId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.GetConnectionResponse res = new com.airbyte.api.models.operations.GetConnectionResponse(contentType, httpRes.statusCode()) {{
            connectionResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.ConnectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.ConnectionResponse.class);
                res.connectionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * List connections
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.ListConnectionsResponse listConnections(com.airbyte.api.models.operations.ListConnectionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/connections");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = com.airbyte.api.utils.Utils.getQueryParams(com.airbyte.api.models.operations.ListConnectionsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.ListConnectionsResponse res = new com.airbyte.api.models.operations.ListConnectionsResponse(contentType, httpRes.statusCode()) {{
            connectionsResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.ConnectionsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.ConnectionsResponse.class);
                res.connectionsResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }
}
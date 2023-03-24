/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api;

import airbyte_prod.public_api.utils.HTTPClient;
import airbyte_prod.public_api.utils.HTTPRequest;
import airbyte_prod.public_api.utils.JSON;
import airbyte_prod.public_api.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

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
    public airbyte_prod.public_api.models.operations.CreateDestinationResponse createDestination(airbyte_prod.public_api.models.operations.CreateDestinationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = airbyte_prod.public_api.utils.Utils.generateURL(baseUrl, "/destinations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = airbyte_prod.public_api.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        airbyte_prod.public_api.models.operations.CreateDestinationResponse res = new airbyte_prod.public_api.models.operations.CreateDestinationResponse() {{
            destinationId = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (airbyte_prod.public_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                airbyte_prod.public_api.models.shared.DestinationId out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), airbyte_prod.public_api.models.shared.DestinationId.class);
                res.destinationId = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }
}
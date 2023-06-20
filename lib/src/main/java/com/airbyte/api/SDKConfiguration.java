/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.models.shared.Security;

class SDKConfiguration {
	public HTTPClient defaultClient;
	public HTTPClient securityClient;
	public Security security;
	public String serverUrl;
	public int serverIdx = 0;
	public String language = "java";
	public String openapiDocVersion = "1.0.0";
	public String sdkVersion = "0.18.4";
	public String genVersion = "2.41.5";
	
}
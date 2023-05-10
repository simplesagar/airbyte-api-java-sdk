/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAzureTable - The values required to configure the source.
 */
public class SourceAzureTable {
    @JsonProperty("sourceType")
    public SourceAzureTableAzureTableEnum sourceType;

    public SourceAzureTable withSourceType(SourceAzureTableAzureTableEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Azure Table Storage Access Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("storage_access_key")
    public String storageAccessKey;

    public SourceAzureTable withStorageAccessKey(String storageAccessKey) {
        this.storageAccessKey = storageAccessKey;
        return this;
    }
    
    /**
     * The name of your storage account.
     */
    @JsonProperty("storage_account_name")
    public String storageAccountName;

    public SourceAzureTable withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }
    
    /**
     * Azure Table Storage service account URL suffix. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain endpoint suffix
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage_endpoint_suffix")
    public String storageEndpointSuffix;

    public SourceAzureTable withStorageEndpointSuffix(String storageEndpointSuffix) {
        this.storageEndpointSuffix = storageEndpointSuffix;
        return this;
    }
    
    public SourceAzureTable(@JsonProperty("sourceType") SourceAzureTableAzureTableEnum sourceType, @JsonProperty("storage_access_key") String storageAccessKey, @JsonProperty("storage_account_name") String storageAccountName) {
        this.sourceType = sourceType;
        this.storageAccessKey = storageAccessKey;
        this.storageAccountName = storageAccountName;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceBigquery - The values required to configure the source.
 */
public class SourceBigquery {
    /**
     * The contents of your Service Account Key JSON file. See the &lt;a href="https://docs.airbyte.com/integrations/sources/bigquery#setup-the-bigquery-source-in-airbyte"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("credentials_json")
    public String credentialsJson;

    public SourceBigquery withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    /**
     * The dataset ID to search for tables and views. If you are only loading data from one dataset, setting this option could result in much faster schema discovery.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataset_id")
    public String datasetId;

    public SourceBigquery withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    /**
     * The GCP project ID for the project containing the target BigQuery dataset.
     */
    @JsonProperty("project_id")
    public String projectId;

    public SourceBigquery withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceBigqueryBigqueryEnum sourceType;

    public SourceBigquery withSourceType(SourceBigqueryBigqueryEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceBigquery(@JsonProperty("credentials_json") String credentialsJson, @JsonProperty("project_id") String projectId, @JsonProperty("sourceType") SourceBigqueryBigqueryEnum sourceType) {
        this.credentialsJson = credentialsJson;
        this.projectId = projectId;
        this.sourceType = sourceType;
  }
}

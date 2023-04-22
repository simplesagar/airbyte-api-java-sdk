/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigqueryDenormalizedLoadingMethodStandardInserts - Loading method used to send select the way data will be uploaded to BigQuery. &lt;br/&gt;&lt;b&gt;Standard Inserts&lt;/b&gt; - Direct uploading using SQL INSERT statements. This method is extremely inefficient and provided only for quick testing. In almost all cases, you should use staging. &lt;br/&gt;&lt;b&gt;GCS Staging&lt;/b&gt; - Writes large batches of records to a file, uploads the file to GCS, then uses &lt;b&gt;COPY INTO table&lt;/b&gt; to upload the file. Recommended for most workloads for better speed and scalability. Read more about GCS Staging &lt;a href="https://docs.airbyte.com/integrations/destinations/bigquery#gcs-staging"&gt;here&lt;/a&gt;.
 */
public class DestinationBigqueryDenormalizedLoadingMethodStandardInserts {
    @JsonProperty("method")
    public DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethodEnum method;
    public DestinationBigqueryDenormalizedLoadingMethodStandardInserts withMethod(DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethodEnum method) {
        this.method = method;
        return this;
    }
    

    public DestinationBigqueryDenormalizedLoadingMethodStandardInserts(@JsonProperty("method") DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethodEnum method) {
    this.method = method;
  }
}

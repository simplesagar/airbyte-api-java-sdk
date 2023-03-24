/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigqueryDenormalizedLoadingMethodGCSStaging - Loading method used to send select the way data will be uploaded to BigQuery. <br/><b>Standard Inserts</b> - Direct uploading using SQL INSERT statements. This method is extremely inefficient and provided only for quick testing. In almost all cases, you should use staging. <br/><b>GCS Staging</b> - Writes large batches of records to a file, uploads the file to GCS, then uses <b>COPY INTO table</b> to upload the file. Recommended for most workloads for better speed and scalability. Read more about GCS Staging <a href="https://docs.airbyte.com/integrations/destinations/bigquery#gcs-staging">here</a>.
 */
public class DestinationBigqueryDenormalizedLoadingMethodGCSStaging {
    /**
     * An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more <a href="https://cloud.google.com/storage/docs/authentication/hmackeys">here</a>.
     */
    @JsonProperty("credential")public Object credential;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withCredential(Object credential) {
        this.credential = credential;
        return this;
    }
    
    /**
     * The name of the GCS bucket. Read more <a href="https://cloud.google.com/storage/docs/naming-buckets">here</a>.
     */
    @JsonProperty("gcs_bucket_name")public String gcsBucketName;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withGcsBucketName(String gcsBucketName) {
        this.gcsBucketName = gcsBucketName;
        return this;
    }
    
    /**
     * Directory under the GCS bucket where data will be written. Read more <a href="https://cloud.google.com/storage/docs/locations">here</a>.
     */
    @JsonProperty("gcs_bucket_path")public String gcsBucketPath;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withGcsBucketPath(String gcsBucketPath) {
        this.gcsBucketPath = gcsBucketPath;
        return this;
    }
    
    /**
     * This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keep_files_in_gcs-bucket")public DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum keepFilesInGcsBucket;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withKeepFilesInGcsBucket(DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum keepFilesInGcsBucket) {
        this.keepFilesInGcsBucket = keepFilesInGcsBucket;
        return this;
    }
    
    @JsonProperty("method")public DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethodEnum method;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withMethod(DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethodEnum method) {
        this.method = method;
        return this;
    }
    
}

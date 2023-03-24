/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecureProviderS3AmazonWebServices - The storage Provider or Location of the file(s) which should be replicated.
 */
public class SourceFileSecureProviderS3AmazonWebServices {
    /**
     * In order to access private Buckets stored on AWS S3, this connector would need credentials with the proper permissions. If accessing publicly available data, this field is not necessary.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_access_key_id")public String awsAccessKeyId;
    public SourceFileSecureProviderS3AmazonWebServices withAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
        return this;
    }
    
    /**
     * In order to access private Buckets stored on AWS S3, this connector would need credentials with the proper permissions. If accessing publicly available data, this field is not necessary.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_secret_access_key")public String awsSecretAccessKey;
    public SourceFileSecureProviderS3AmazonWebServices withAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
        return this;
    }
    
    @JsonProperty("storage")public SourceFileSecureProviderS3AmazonWebServicesStorageEnum storage;
    public SourceFileSecureProviderS3AmazonWebServices withStorage(SourceFileSecureProviderS3AmazonWebServicesStorageEnum storage) {
        this.storage = storage;
        return this;
    }
    
}

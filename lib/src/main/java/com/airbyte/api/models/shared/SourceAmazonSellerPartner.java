/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAmazonSellerPartner - The values required to configure the source.
 */

public class SourceAmazonSellerPartner {
    /**
     * Additional information to configure report options. This varies by report type, not every report implement this kind of feature. Must be a valid json string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("advanced_stream_options")
    public String advancedStreamOptions;

    public SourceAmazonSellerPartner withAdvancedStreamOptions(String advancedStreamOptions) {
        this.advancedStreamOptions = advancedStreamOptions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceAmazonSellerPartnerAuthType authType;

    public SourceAmazonSellerPartner withAuthType(SourceAmazonSellerPartnerAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Specifies the AWS access key used as part of the credentials to authenticate the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_access_key")
    public String awsAccessKey;

    public SourceAmazonSellerPartner withAwsAccessKey(String awsAccessKey) {
        this.awsAccessKey = awsAccessKey;
        return this;
    }
    
    /**
     * Select the AWS Environment.
     */
    @JsonProperty("aws_environment")
    public SourceAmazonSellerPartnerAWSEnvironment awsEnvironment;

    public SourceAmazonSellerPartner withAwsEnvironment(SourceAmazonSellerPartnerAWSEnvironment awsEnvironment) {
        this.awsEnvironment = awsEnvironment;
        return this;
    }
    
    /**
     * Specifies the AWS secret key used as part of the credentials to authenticate the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_secret_key")
    public String awsSecretKey;

    public SourceAmazonSellerPartner withAwsSecretKey(String awsSecretKey) {
        this.awsSecretKey = awsSecretKey;
        return this;
    }
    
    /**
     * Your Login with Amazon Client ID.
     */
    @JsonProperty("lwa_app_id")
    public String lwaAppId;

    public SourceAmazonSellerPartner withLwaAppId(String lwaAppId) {
        this.lwaAppId = lwaAppId;
        return this;
    }
    
    /**
     * Your Login with Amazon Client Secret.
     */
    @JsonProperty("lwa_client_secret")
    public String lwaClientSecret;

    public SourceAmazonSellerPartner withLwaClientSecret(String lwaClientSecret) {
        this.lwaClientSecret = lwaClientSecret;
        return this;
    }
    
    /**
     * Sometimes report can take up to 30 minutes to generate. This will set the limit for how long to wait for a successful report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_wait_seconds")
    public Long maxWaitSeconds;

    public SourceAmazonSellerPartner withMaxWaitSeconds(Long maxWaitSeconds) {
        this.maxWaitSeconds = maxWaitSeconds;
        return this;
    }
    
    /**
     * Will be used for stream slicing for initial full_refresh sync when no updated state is present for reports that support sliced incremental sync.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("period_in_days")
    public Long periodInDays;

    public SourceAmazonSellerPartner withPeriodInDays(Long periodInDays) {
        this.periodInDays = periodInDays;
        return this;
    }
    
    /**
     * The Refresh Token obtained via OAuth flow authorization.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceAmazonSellerPartner withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    /**
     * Select the AWS Region.
     */
    @JsonProperty("region")
    public SourceAmazonSellerPartnerAWSRegion region;

    public SourceAmazonSellerPartner withRegion(SourceAmazonSellerPartnerAWSRegion region) {
        this.region = region;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_end_date")
    public String replicationEndDate;

    public SourceAmazonSellerPartner withReplicationEndDate(String replicationEndDate) {
        this.replicationEndDate = replicationEndDate;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("replication_start_date")
    public String replicationStartDate;

    public SourceAmazonSellerPartner withReplicationStartDate(String replicationStartDate) {
        this.replicationStartDate = replicationStartDate;
        return this;
    }
    
    /**
     * Additional information passed to reports. This varies by report type. Must be a valid json string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_options")
    public String reportOptions;

    public SourceAmazonSellerPartner withReportOptions(String reportOptions) {
        this.reportOptions = reportOptions;
        return this;
    }
    
    /**
     * Specifies the Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations requested using this profile. (Needs permission to 'Assume Role' STS).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role_arn")
    public String roleArn;

    public SourceAmazonSellerPartner withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceAmazonSellerPartnerAmazonSellerPartner sourceType;

    public SourceAmazonSellerPartner withSourceType(SourceAmazonSellerPartnerAmazonSellerPartner sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceAmazonSellerPartner(@JsonProperty("aws_environment") SourceAmazonSellerPartnerAWSEnvironment awsEnvironment, @JsonProperty("lwa_app_id") String lwaAppId, @JsonProperty("lwa_client_secret") String lwaClientSecret, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("region") SourceAmazonSellerPartnerAWSRegion region, @JsonProperty("replication_start_date") String replicationStartDate, @JsonProperty("sourceType") SourceAmazonSellerPartnerAmazonSellerPartner sourceType) {
        this.awsEnvironment = awsEnvironment;
        this.lwaAppId = lwaAppId;
        this.lwaClientSecret = lwaClientSecret;
        this.refreshToken = refreshToken;
        this.region = region;
        this.replicationStartDate = replicationStartDate;
        this.sourceType = sourceType;
  }
}

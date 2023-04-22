/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPubsub - The values required to configure the destination.
 */
public class DestinationPubsub {
    /**
     * Number of ms before the buffer is flushed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batching_delay_threshold")
    public Long batchingDelayThreshold;
    public DestinationPubsub withBatchingDelayThreshold(Long batchingDelayThreshold) {
        this.batchingDelayThreshold = batchingDelayThreshold;
        return this;
    }
    
    /**
     * Number of messages before the buffer is flushed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batching_element_count_threshold")
    public Long batchingElementCountThreshold;
    public DestinationPubsub withBatchingElementCountThreshold(Long batchingElementCountThreshold) {
        this.batchingElementCountThreshold = batchingElementCountThreshold;
        return this;
    }
    
    /**
     * If TRUE messages will be buffered instead of sending them one by one
     */
    @JsonProperty("batching_enabled")
    public Boolean batchingEnabled;
    public DestinationPubsub withBatchingEnabled(Boolean batchingEnabled) {
        this.batchingEnabled = batchingEnabled;
        return this;
    }
    
    /**
     * Number of bytes before the buffer is flushed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batching_request_bytes_threshold")
    public Long batchingRequestBytesThreshold;
    public DestinationPubsub withBatchingRequestBytesThreshold(Long batchingRequestBytesThreshold) {
        this.batchingRequestBytesThreshold = batchingRequestBytesThreshold;
        return this;
    }
    
    /**
     * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.com/integrations/destinations/pubsub"&gt;docs&lt;/a&gt; if you need help generating this key.
     */
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationPubsub withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationPubsubPubsubEnum destinationType;
    public DestinationPubsub withDestinationType(DestinationPubsubPubsubEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * If TRUE PubSub publisher will have &lt;a href="https://cloud.google.com/pubsub/docs/ordering"&gt;message ordering&lt;/a&gt; enabled. Every message will have an ordering key of stream
     */
    @JsonProperty("ordering_enabled")
    public Boolean orderingEnabled;
    public DestinationPubsub withOrderingEnabled(Boolean orderingEnabled) {
        this.orderingEnabled = orderingEnabled;
        return this;
    }
    
    /**
     * The GCP project ID for the project containing the target PubSub.
     */
    @JsonProperty("project_id")
    public String projectId;
    public DestinationPubsub withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    /**
     * The PubSub topic ID in the given GCP project ID.
     */
    @JsonProperty("topic_id")
    public String topicId;
    public DestinationPubsub withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    

    public DestinationPubsub(@JsonProperty("batching_enabled") Boolean batchingEnabled, @JsonProperty("credentials_json") String credentialsJson, @JsonProperty("destinationType") DestinationPubsubPubsubEnum destinationType, @JsonProperty("ordering_enabled") Boolean orderingEnabled, @JsonProperty("project_id") String projectId, @JsonProperty("topic_id") String topicId) {
    this.batchingEnabled = batchingEnabled;
this.credentialsJson = credentialsJson;
this.destinationType = destinationType;
this.orderingEnabled = orderingEnabled;
this.projectId = projectId;
this.topicId = topicId;
  }
}

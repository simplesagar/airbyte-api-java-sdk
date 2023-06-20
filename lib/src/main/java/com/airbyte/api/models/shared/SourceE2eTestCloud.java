/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceE2eTestCloud - The values required to configure the source.
 */

public class SourceE2eTestCloud {
    /**
     * Number of records to emit per stream. Min 1. Max 100 billion.
     */
    @JsonProperty("max_messages")
    public Long maxMessages;

    public SourceE2eTestCloud withMaxMessages(Long maxMessages) {
        this.maxMessages = maxMessages;
        return this;
    }
    
    /**
     * Interval between messages in ms. Min 0 ms. Max 60000 ms (1 minute).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_interval_ms")
    public Long messageIntervalMs;

    public SourceE2eTestCloud withMessageIntervalMs(Long messageIntervalMs) {
        this.messageIntervalMs = messageIntervalMs;
        return this;
    }
    
    @JsonProperty("mock_catalog")
    public Object mockCatalog;

    public SourceE2eTestCloud withMockCatalog(Object mockCatalog) {
        this.mockCatalog = mockCatalog;
        return this;
    }
    
    /**
     * When the seed is unspecified, the current time millis will be used as the seed. Range: [0, 1000000].
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("seed")
    public Long seed;

    public SourceE2eTestCloud withSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceE2eTestCloudE2eTestCloud sourceType;

    public SourceE2eTestCloud withSourceType(SourceE2eTestCloudE2eTestCloud sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public SourceE2eTestCloudType type;

    public SourceE2eTestCloud withType(SourceE2eTestCloudType type) {
        this.type = type;
        return this;
    }
    
    public SourceE2eTestCloud(@JsonProperty("max_messages") Long maxMessages, @JsonProperty("mock_catalog") Object mockCatalog, @JsonProperty("sourceType") SourceE2eTestCloudE2eTestCloud sourceType) {
        this.maxMessages = maxMessages;
        this.mockCatalog = mockCatalog;
        this.sourceType = sourceType;
  }
}

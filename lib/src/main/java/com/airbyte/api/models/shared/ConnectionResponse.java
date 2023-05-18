/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectionResponse - Provides details of a single connection.
 */
public class ConnectionResponse {
    @JsonProperty("connectionId")
    public String connectionId;

    public ConnectionResponse withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @JsonProperty("dataResidency")
    public GeographyEnumEnum dataResidency;

    public ConnectionResponse withDataResidency(GeographyEnumEnum dataResidency) {
        this.dataResidency = dataResidency;
        return this;
    }
    
    @JsonProperty("destinationId")
    public String destinationId;

    public ConnectionResponse withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public ConnectionResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Define the location where the data will be stored in the destination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceDefinition")
    public NamespaceDefinitionEnumEnum namespaceDefinition;

    public ConnectionResponse withNamespaceDefinition(NamespaceDefinitionEnumEnum namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceFormat")
    public String namespaceFormat;

    public ConnectionResponse withNamespaceFormat(String namespaceFormat) {
        this.namespaceFormat = namespaceFormat;
        return this;
    }
    
    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nonBreakingSchemaUpdatesBehavior")
    public NonBreakingSchemaUpdatesBehaviorEnumEnum nonBreakingSchemaUpdatesBehavior;

    public ConnectionResponse withNonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnumEnum nonBreakingSchemaUpdatesBehavior) {
        this.nonBreakingSchemaUpdatesBehavior = nonBreakingSchemaUpdatesBehavior;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefix")
    public String prefix;

    public ConnectionResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    
    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @JsonProperty("schedule")
    public ConnectionScheduleResponse schedule;

    public ConnectionResponse withSchedule(ConnectionScheduleResponse schedule) {
        this.schedule = schedule;
        return this;
    }
    
    @JsonProperty("sourceId")
    public String sourceId;

    public ConnectionResponse withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    @JsonProperty("status")
    public ConnectionStatusEnumEnum status;

    public ConnectionResponse withStatus(ConnectionStatusEnumEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;

    public ConnectionResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public ConnectionResponse(@JsonProperty("connectionId") String connectionId, @JsonProperty("dataResidency") GeographyEnumEnum dataResidency, @JsonProperty("destinationId") String destinationId, @JsonProperty("name") String name, @JsonProperty("schedule") ConnectionScheduleResponse schedule, @JsonProperty("sourceId") String sourceId, @JsonProperty("status") ConnectionStatusEnumEnum status, @JsonProperty("workspaceId") String workspaceId) {
        this.connectionId = connectionId;
        this.dataResidency = dataResidency;
        this.destinationId = destinationId;
        this.name = name;
        this.schedule = schedule;
        this.sourceId = sourceId;
        this.status = status;
        this.workspaceId = workspaceId;
  }
}

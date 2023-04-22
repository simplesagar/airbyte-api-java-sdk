/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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

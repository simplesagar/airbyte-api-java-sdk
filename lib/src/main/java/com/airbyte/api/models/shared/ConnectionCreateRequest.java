/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectionCreateRequest {
    /**
     * A list of configured stream options for a connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("configurations")
    public StreamConfigurations configurations;

    public ConnectionCreateRequest withConfigurations(StreamConfigurations configurations) {
        this.configurations = configurations;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataResidency")
    public GeographyEnum dataResidency;

    public ConnectionCreateRequest withDataResidency(GeographyEnum dataResidency) {
        this.dataResidency = dataResidency;
        return this;
    }
    
    @JsonProperty("destinationId")
    public String destinationId;

    public ConnectionCreateRequest withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    /**
     * Optional name of the connection
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public ConnectionCreateRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Define the location where the data will be stored in the destination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceDefinition")
    public NamespaceDefinitionEnum namespaceDefinition;

    public ConnectionCreateRequest withNamespaceDefinition(NamespaceDefinitionEnum namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
        return this;
    }
    
    /**
     * Used when namespaceDefinition is 'custom_format'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceFormat")
    public String namespaceFormat;

    public ConnectionCreateRequest withNamespaceFormat(String namespaceFormat) {
        this.namespaceFormat = namespaceFormat;
        return this;
    }
    
    /**
     * Set how Airbyte handles syncs when it detects a non-breaking schema change in the source
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nonBreakingSchemaUpdatesBehavior")
    public NonBreakingSchemaUpdatesBehaviorEnum nonBreakingSchemaUpdatesBehavior;

    public ConnectionCreateRequest withNonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnum nonBreakingSchemaUpdatesBehavior) {
        this.nonBreakingSchemaUpdatesBehavior = nonBreakingSchemaUpdatesBehavior;
        return this;
    }
    
    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination (ex. “airbyte_” causes “projects” =&gt; “airbyte_projects”).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefix")
    public String prefix;

    public ConnectionCreateRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    
    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schedule")
    public ConnectionScheduleCreate schedule;

    public ConnectionCreateRequest withSchedule(ConnectionScheduleCreate schedule) {
        this.schedule = schedule;
        return this;
    }
    
    @JsonProperty("sourceId")
    public String sourceId;

    public ConnectionCreateRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    public ConnectionCreateRequest(@JsonProperty("destinationId") String destinationId, @JsonProperty("sourceId") String sourceId) {
        this.destinationId = destinationId;
        this.sourceId = sourceId;
  }
}

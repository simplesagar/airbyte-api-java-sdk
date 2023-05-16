/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkspacesResponse - Successful operation
 */
public class WorkspacesResponse {
    @JsonProperty("data")
    public WorkspaceResponse[] data;

    public WorkspacesResponse withData(WorkspaceResponse[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;

    public WorkspacesResponse withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;

    public WorkspacesResponse withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    public WorkspacesResponse(@JsonProperty("data") WorkspaceResponse[] data) {
        this.data = data;
  }
}

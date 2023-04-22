/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWorkspaceRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    public String workspaceId;
    public GetWorkspaceRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    

    public GetWorkspaceRequest(@JsonProperty("workspaceId") String workspaceId) {
    this.workspaceId = workspaceId;
  }
}

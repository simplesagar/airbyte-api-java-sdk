/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.api.models.operations;

import airbyte_prod.api.utils.SpeakeasyMetadata;

public class DeleteConnectionRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    public String connectionId;
    public DeleteConnectionRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlReplicationMethodLogicalReplicationCDC - CDC uses {TBC} to detect inserts, updates, and deletes. This needs to be configured on the source database itself.
 */
public class SourceMssqlReplicationMethodLogicalReplicationCDC {
    /**
     * What data should be synced under the CDC. "Existing and New" will read existing data as a snapshot, and sync new changes through CDC. "New Changes Only" will skip the initial snapshot, and only sync new changes through CDC.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data_to_sync")public SourceMssqlReplicationMethodLogicalReplicationCDCDataToSyncEnum dataToSync;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withDataToSync(SourceMssqlReplicationMethodLogicalReplicationCDCDataToSyncEnum dataToSync) {
        this.dataToSync = dataToSync;
        return this;
    }
    
    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about <a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc">initial waiting time</a>.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_waiting_seconds")public Long initialWaitingSeconds;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withInitialWaitingSeconds(Long initialWaitingSeconds) {
        this.initialWaitingSeconds = initialWaitingSeconds;
        return this;
    }
    
    @JsonProperty("method")public SourceMssqlReplicationMethodLogicalReplicationCDCMethodEnum method;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withMethod(SourceMssqlReplicationMethodLogicalReplicationCDCMethodEnum method) {
        this.method = method;
        return this;
    }
    
    /**
     * Existing data in the database are synced through an initial snapshot. This parameter controls the isolation level that will be used during the initial snapshotting. If you choose the "Snapshot" level, you must enable the <a href="https://docs.microsoft.com/en-us/dotnet/framework/data/adonet/sql/snapshot-isolation-in-sql-server">snapshot isolation mode</a> on the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("snapshot_isolation")public SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum snapshotIsolation;
    public SourceMssqlReplicationMethodLogicalReplicationCDC withSnapshotIsolation(SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum snapshotIsolation) {
        this.snapshotIsolation = snapshotIsolation;
        return this;
    }
    
}

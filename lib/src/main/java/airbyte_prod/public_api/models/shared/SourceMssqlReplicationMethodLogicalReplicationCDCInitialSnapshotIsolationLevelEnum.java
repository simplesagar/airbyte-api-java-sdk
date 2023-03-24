/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum - Existing data in the database are synced through an initial snapshot. This parameter controls the isolation level that will be used during the initial snapshotting. If you choose the "Snapshot" level, you must enable the <a href="https://docs.microsoft.com/en-us/dotnet/framework/data/adonet/sql/snapshot-isolation-in-sql-server">snapshot isolation mode</a> on the database.
 */
public enum SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum {
    SNAPSHOT("Snapshot"),
    READ_COMMITTED("Read Committed");

    @JsonValue
    public final String value;

    private SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum(String value) {
        this.value = value;
    }
}

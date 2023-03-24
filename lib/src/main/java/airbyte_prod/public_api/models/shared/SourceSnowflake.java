/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSnowflake - The values required to configure the source.
 */
public class SourceSnowflake {
    @JsonProperty("airbyte-source-name")public SourceSnowflakeSnowflakeEnum airbyteSourceName;
    public SourceSnowflake withAirbyteSourceName(SourceSnowflakeSnowflakeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")public Object credentials;
    public SourceSnowflake withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * The database you created for Airbyte to access data.
     */
    @JsonProperty("database")public String database;
    public SourceSnowflake withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * The host domain of the snowflake instance (must include the account, region, cloud environment, and end with snowflakecomputing.com).
     */
    @JsonProperty("host")public String host;
    public SourceSnowflake withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&'. (example: key1=value1&key2=value2&key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")public String jdbcUrlParams;
    public SourceSnowflake withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * The role you created for Airbyte to access Snowflake.
     */
    @JsonProperty("role")public String role;
    public SourceSnowflake withRole(String role) {
        this.role = role;
        return this;
    }
    
    /**
     * The source Snowflake schema tables. Leave empty to access tables from multiple schemas.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")public String schema;
    public SourceSnowflake withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * The warehouse you created for Airbyte to access data.
     */
    @JsonProperty("warehouse")public String warehouse;
    public SourceSnowflake withWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    
}

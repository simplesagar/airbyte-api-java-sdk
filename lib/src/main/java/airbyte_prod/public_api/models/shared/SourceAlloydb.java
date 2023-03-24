/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAlloydb - The values required to configure the source.
 */
public class SourceAlloydb {
    @JsonProperty("airbyte-source-name")public SourceAlloydbAlloydbEnum airbyteSourceName;
    public SourceAlloydb withAirbyteSourceName(SourceAlloydbAlloydbEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Name of the database.
     */
    @JsonProperty("database")public String database;
    public SourceAlloydb withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Hostname of the database.
     */
    @JsonProperty("host")public String host;
    public SourceAlloydb withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&'. (Eg. key1=value1&key2=value2&key3=value3). For more information read about <a href="https://jdbc.postgresql.org/documentation/head/connect.html">JDBC URL parameters</a>.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")public String jdbcUrlParams;
    public SourceAlloydb withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")public String password;
    public SourceAlloydb withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     */
    @JsonProperty("port")public Long port;
    public SourceAlloydb withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Replication method for extracting data from the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_method")public Object replicationMethod;
    public SourceAlloydb withReplicationMethod(Object replicationMethod) {
        this.replicationMethod = replicationMethod;
        return this;
    }
    
    /**
     * The list of schemas (case sensitive) to sync from. Defaults to public.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")public String[] schemas;
    public SourceAlloydb withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    /**
     * SSL connection modes. 
     *   Read more <a href="https://jdbc.postgresql.org/documentation/head/ssl-client.html"> in the docs</a>.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")public Object sslMode;
    public SourceAlloydb withSslMode(Object sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")public Object tunnelMethod;
    public SourceAlloydb withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Username to access the database.
     */
    @JsonProperty("username")public String username;
    public SourceAlloydb withUsername(String username) {
        this.username = username;
        return this;
    }
    
}

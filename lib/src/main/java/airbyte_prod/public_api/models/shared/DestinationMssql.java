/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMssql - The values required to configure the destination.
 */
public class DestinationMssql {
    @JsonProperty("airbyte-destination-name")public DestinationMssqlMssqlEnum airbyteDestinationName;
    public DestinationMssql withAirbyteDestinationName(DestinationMssqlMssqlEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * The name of the MSSQL database.
     */
    @JsonProperty("database")public String database;
    public DestinationMssql withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * The host name of the MSSQL database.
     */
    @JsonProperty("host")public String host;
    public DestinationMssql withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&'. (example: key1=value1&key2=value2&key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")public String jdbcUrlParams;
    public DestinationMssql withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * The password associated with this username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")public String password;
    public DestinationMssql withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * The port of the MSSQL database.
     */
    @JsonProperty("port")public Long port;
    public DestinationMssql withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * The default schema tables are written to if the source does not specify a namespace. The usual value for this field is "public".
     */
    @JsonProperty("schema")public String schema;
    public DestinationMssql withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * The encryption method which is used to communicate with the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_method")public Object sslMethod;
    public DestinationMssql withSslMethod(Object sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")public Object tunnelMethod;
    public DestinationMssql withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * The username which is used to access the database.
     */
    @JsonProperty("username")public String username;
    public DestinationMssql withUsername(String username) {
        this.username = username;
        return this;
    }
    
}

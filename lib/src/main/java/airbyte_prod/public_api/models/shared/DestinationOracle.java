/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationOracle - The values required to configure the destination.
 */
public class DestinationOracle {
    @JsonProperty("airbyte-destination-name")public DestinationOracleOracleEnum airbyteDestinationName;
    public DestinationOracle withAirbyteDestinationName(DestinationOracleOracleEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * The hostname of the database.
     */
    @JsonProperty("host")public String host;
    public DestinationOracle withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&'. (example: key1=value1&key2=value2&key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")public String jdbcUrlParams;
    public DestinationOracle withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * The password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")public String password;
    public DestinationOracle withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * The port of the database.
     */
    @JsonProperty("port")public Long port;
    public DestinationOracle withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * The default schema is used as the target schema for all statements issued from the connection that do not explicitly specify a schema name. The usual value for this field is "airbyte".  In Oracle, schemas and users are the same thing, so the "user" parameter is used as the login credentials and this is used for the default Airbyte message schema.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")public String schema;
    public DestinationOracle withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * The System Identifier uniquely distinguishes the instance from any other instance on the same computer.
     */
    @JsonProperty("sid")public String sid;
    public DestinationOracle withSid(String sid) {
        this.sid = sid;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")public Object tunnelMethod;
    public DestinationOracle withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * The username to access the database. This user must have CREATE USER privileges in the database.
     */
    @JsonProperty("username")public String username;
    public DestinationOracle withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
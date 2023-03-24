/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMysql - The values required to configure the destination.
 */
public class DestinationMysql {
    @JsonProperty("airbyte-destination-name")public DestinationMysqlMysqlEnum airbyteDestinationName;
    public DestinationMysql withAirbyteDestinationName(DestinationMysqlMysqlEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * Name of the database.
     */
    @JsonProperty("database")public String database;
    public DestinationMysql withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Hostname of the database.
     */
    @JsonProperty("host")public String host;
    public DestinationMysql withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&'. (example: key1=value1&key2=value2&key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")public String jdbcUrlParams;
    public DestinationMysql withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")public String password;
    public DestinationMysql withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     */
    @JsonProperty("port")public Long port;
    public DestinationMysql withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")public Object tunnelMethod;
    public DestinationMysql withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")public String username;
    public DestinationMysql withUsername(String username) {
        this.username = username;
        return this;
    }
    
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgres - The values required to configure the destination.
 */
public class DestinationPostgres {
    @JsonProperty("airbyte-destination-name")public DestinationPostgresPostgresEnum airbyteDestinationName;
    public DestinationPostgres withAirbyteDestinationName(DestinationPostgresPostgresEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * Name of the database.
     */
    @JsonProperty("database")public String database;
    public DestinationPostgres withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Hostname of the database.
     */
    @JsonProperty("host")public String host;
    public DestinationPostgres withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&'. (example: key1=value1&key2=value2&key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")public String jdbcUrlParams;
    public DestinationPostgres withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")public String password;
    public DestinationPostgres withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     */
    @JsonProperty("port")public Long port;
    public DestinationPostgres withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * The default schema tables are written to if the source does not specify a namespace. The usual value for this field is "public".
     */
    @JsonProperty("schema")public String schema;
    public DestinationPostgres withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * SSL connection modes. 
     *  <b>disable</b> - Chose this mode to disable encryption of communication between Airbyte and destination database
     *  <b>allow</b> - Chose this mode to enable encryption only when required by the source database
     *  <b>prefer</b> - Chose this mode to allow unencrypted connection only if the source database does not support encryption
     *  <b>require</b> - Chose this mode to always require encryption. If the source database server does not support encryption, connection will fail
     *   <b>verify-ca</b> - Chose this mode to always require encryption and to verify that the source database server has a valid SSL certificate
     *   <b>verify-full</b> - This is the most secure mode. Chose this mode to always require encryption and to verify the identity of the source database server
     *  See more information - <a href="https://jdbc.postgresql.org/documentation/head/ssl-client.html"> in the docs</a>.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")public Object sslMode;
    public DestinationPostgres withSslMode(Object sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")public Object tunnelMethod;
    public DestinationPostgres withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")public String username;
    public DestinationPostgres withUsername(String username) {
        this.username = username;
        return this;
    }
    
}

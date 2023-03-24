/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMysqlTunnelMethodNoTunnel - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
public class DestinationMysqlTunnelMethodNoTunnel {
    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")public DestinationMysqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationMysqlTunnelMethodNoTunnel withTunnelMethod(DestinationMysqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}

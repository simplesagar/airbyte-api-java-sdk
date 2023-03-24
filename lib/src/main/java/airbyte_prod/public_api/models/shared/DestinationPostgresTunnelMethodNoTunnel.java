/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresTunnelMethodNoTunnel - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
public class DestinationPostgresTunnelMethodNoTunnel {
    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")public DestinationPostgresTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationPostgresTunnelMethodNoTunnel withTunnelMethod(DestinationPostgresTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}

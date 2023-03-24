/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracleTunnelMethodNoTunnel - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
public class SourceOracleTunnelMethodNoTunnel {
    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")public SourceOracleTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public SourceOracleTunnelMethodNoTunnel withTunnelMethod(SourceOracleTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePostgresTunnelMethodPasswordAuthentication - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
public class SourcePostgresTunnelMethodPasswordAuthentication {
    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public SourcePostgresTunnelMethodPasswordAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    /**
     * Connect through a jump server tunnel host using username and password authentication
     */
    @JsonProperty("tunnel_method")
    public SourcePostgresTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod;
    public SourcePostgresTunnelMethodPasswordAuthentication withTunnelMethod(SourcePostgresTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public SourcePostgresTunnelMethodPasswordAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    /**
     * OS-level username for logging into the jump server host
     */
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public SourcePostgresTunnelMethodPasswordAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
    /**
     * OS-level password for logging into the jump server host
     */
    @JsonProperty("tunnel_user_password")
    public String tunnelUserPassword;
    public SourcePostgresTunnelMethodPasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
        this.tunnelUserPassword = tunnelUserPassword;
        return this;
    }
    

    public SourcePostgresTunnelMethodPasswordAuthentication(@JsonProperty("tunnel_user") String tunnelUser, @JsonProperty("tunnel_user_password") String tunnelUserPassword, @JsonProperty("tunnel_host") String tunnelHost, @JsonProperty("tunnel_method") SourcePostgresTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod, @JsonProperty("tunnel_port") Long tunnelPort) {
    this.tunnelUser = tunnelUser;
this.tunnelUserPassword = tunnelUserPassword;
this.tunnelHost = tunnelHost;
this.tunnelMethod = tunnelMethod;
this.tunnelPort = tunnelPort;
  }
}

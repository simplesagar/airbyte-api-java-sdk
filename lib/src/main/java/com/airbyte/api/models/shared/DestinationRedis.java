/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedis - The values required to configure the destination.
 */

public class DestinationRedis {
    /**
     * Redis cache type to store data in.
     */
    @JsonProperty("cache_type")
    public DestinationRedisCacheType cacheType;

    public DestinationRedis withCacheType(DestinationRedisCacheType cacheType) {
        this.cacheType = cacheType;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationRedisRedis destinationType;

    public DestinationRedis withDestinationType(DestinationRedisRedis destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Redis host to connect to.
     */
    @JsonProperty("host")
    public String host;

    public DestinationRedis withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Password associated with Redis.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;

    public DestinationRedis withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of Redis.
     */
    @JsonProperty("port")
    public Long port;

    public DestinationRedis withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl")
    public Boolean ssl;

    public DestinationRedis withSsl(Boolean ssl) {
        this.ssl = ssl;
        return this;
    }
    
    /**
     * SSL connection modes. 
     *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    public Object sslMode;

    public DestinationRedis withSslMode(Object sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;

    public DestinationRedis withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Username associated with Redis.
     */
    @JsonProperty("username")
    public String username;

    public DestinationRedis withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public DestinationRedis(@JsonProperty("cache_type") DestinationRedisCacheType cacheType, @JsonProperty("destinationType") DestinationRedisRedis destinationType, @JsonProperty("host") String host, @JsonProperty("port") Long port, @JsonProperty("username") String username) {
        this.cacheType = cacheType;
        this.destinationType = destinationType;
        this.host = host;
        this.port = port;
        this.username = username;
  }
}

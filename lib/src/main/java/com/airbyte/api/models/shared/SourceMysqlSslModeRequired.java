/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlSslModeRequired - Always connect with SSL. If the MySQL server doesn\u2019t support SSL, the connection will not be established. Certificate Authority (CA) and Hostname are not verified.
 */
public class SourceMysqlSslModeRequired {
    @JsonProperty("mode")
    public SourceMysqlSslModeRequiredModeEnum mode;
    public SourceMysqlSslModeRequired withMode(SourceMysqlSslModeRequiredModeEnum mode) {
        this.mode = mode;
        return this;
    }
    

    public SourceMysqlSslModeRequired(@JsonProperty("mode") SourceMysqlSslModeRequiredModeEnum mode) {
    this.mode = mode;
  }
}

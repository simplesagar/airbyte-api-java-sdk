/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRedshift - The values required to configure the source.
 */
public class SourceRedshift {
    /**
     * Name of the database.
     */
    @JsonProperty("database")
    public String database;
    public SourceRedshift withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Host Endpoint of the Redshift Cluster (must include the cluster-id, region and end with .redshift.amazonaws.com).
     */
    @JsonProperty("host")
    public String host;
    public SourceRedshift withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceRedshift withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonProperty("password")
    public String password;
    public SourceRedshift withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     */
    @JsonProperty("port")
    public Long port;
    public SourceRedshift withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * The list of schemas to sync from. Specify one or more explicitly or keep empty to process all schemas. Schema names are case sensitive.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    public String[] schemas;
    public SourceRedshift withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceRedshiftRedshiftEnum sourceType;
    public SourceRedshift withSourceType(SourceRedshiftRedshiftEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    public String username;
    public SourceRedshift withUsername(String username) {
        this.username = username;
        return this;
    }
    
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMongodb - The values required to configure the source.
 */
public class SourceMongodb {
    @JsonProperty("airbyte-source-name")public SourceMongodbMongodbEnum airbyteSourceName;
    public SourceMongodb withAirbyteSourceName(SourceMongodbMongodbEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * The authentication source where the user information is stored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_source")public String authSource;
    public SourceMongodb withAuthSource(String authSource) {
        this.authSource = authSource;
        return this;
    }
    
    /**
     * The database you want to replicate.
     */
    @JsonProperty("database")public String database;
    public SourceMongodb withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * The MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance_type")public Object instanceType;
    public SourceMongodb withInstanceType(Object instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    /**
     * The password associated with this username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")public String password;
    public SourceMongodb withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * The username which is used to access the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")public String user;
    public SourceMongodb withUser(String user) {
        this.user = user;
        return this;
    }
    
}

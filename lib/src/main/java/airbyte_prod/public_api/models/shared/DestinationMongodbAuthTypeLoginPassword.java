/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbAuthTypeLoginPassword - Login/Password.
 */
public class DestinationMongodbAuthTypeLoginPassword {
    @JsonProperty("authorization")public DestinationMongodbAuthTypeLoginPasswordAuthorizationEnum authorization;
    public DestinationMongodbAuthTypeLoginPassword withAuthorization(DestinationMongodbAuthTypeLoginPasswordAuthorizationEnum authorization) {
        this.authorization = authorization;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonProperty("password")public String password;
    public DestinationMongodbAuthTypeLoginPassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")public String username;
    public DestinationMongodbAuthTypeLoginPassword withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleAdsCustomQueries {
    /**
     * A custom defined GAQL query for building the report. Should not contain segments.date expression because it is used by incremental streams. See Google's <a href="https://developers.google.com/google-ads/api/fields/v11/overview_query_builder">query builder</a> for more information.
     */
    @JsonProperty("query")public String query;
    public SourceGoogleAdsCustomQueries withQuery(String query) {
        this.query = query;
        return this;
    }
    
    /**
     * The table name in your destination database for choosen query.
     */
    @JsonProperty("table_name")public String tableName;
    public SourceGoogleAdsCustomQueries withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
}

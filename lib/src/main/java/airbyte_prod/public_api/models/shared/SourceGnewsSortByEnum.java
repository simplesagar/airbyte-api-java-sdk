/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceGnewsSortByEnum - This parameter allows you to choose with which type of sorting the articles should be returned. Two values  are possible:
 *   - publishedAt = sort by publication date, the articles with the most recent publication date are returned first
 *   - relevance = sort by best match to keywords, the articles with the best match are returned first
 */
public enum SourceGnewsSortByEnum {
    PUBLISHED_AT("publishedAt"),
    RELEVANCE("relevance");

    @JsonValue
    public final String value;

    private SourceGnewsSortByEnum(String value) {
        this.value = value;
    }
}
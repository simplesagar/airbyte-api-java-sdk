/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceS3FormatJsonlFiletypeEnum {
    JSONL("jsonl");

    @JsonValue
    public final String value;

    private SourceS3FormatJsonlFiletypeEnum(String value) {
        this.value = value;
    }
}

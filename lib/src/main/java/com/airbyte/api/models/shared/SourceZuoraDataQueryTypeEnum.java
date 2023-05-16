/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceZuoraDataQueryTypeEnum - Choose between `Live`, or `Unlimited` - the optimized, replicated database at 12 hours freshness for high volume extraction &lt;a href="https://knowledgecenter.zuora.com/Central_Platform/Query/Data_Query/A_Overview_of_Data_Query#Query_Processing_Limitations"&gt;Link&lt;/a&gt;
 */
public enum SourceZuoraDataQueryTypeEnum {
    LIVE("Live"),
    UNLIMITED("Unlimited");

    @JsonValue
    public final String value;

    private SourceZuoraDataQueryTypeEnum(String value) {
        this.value = value;
    }
}

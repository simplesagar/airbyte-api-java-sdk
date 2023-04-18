/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceGnewsCountryEnum - This parameter allows you to specify the country where the news articles returned by the API were published, the contents of the articles are not necessarily related to the specified country. You have to set as value the 2 letters code of the country you want to filter.
 */
public enum SourceGnewsCountryEnum {
    AU("au"),
    BR("br"),
    CA("ca"),
    CN("cn"),
    EG("eg"),
    FR("fr"),
    DE("de"),
    GR("gr"),
    HK("hk"),
    IN("in"),
    IE("ie"),
    IL("il"),
    IT("it"),
    JP("jp"),
    NL("nl"),
    NO("no"),
    PK("pk"),
    PE("pe"),
    PH("ph"),
    PT("pt"),
    RO("ro"),
    RU("ru"),
    SG("sg"),
    ES("es"),
    SE("se"),
    CH("ch"),
    TW("tw"),
    UA("ua"),
    GB("gb"),
    US("us");

    @JsonValue
    public final String value;

    private SourceGnewsCountryEnum(String value) {
        this.value = value;
    }
}

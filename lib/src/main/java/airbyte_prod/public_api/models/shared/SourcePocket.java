/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePocket - The values required to configure the source.
 */
public class SourcePocket {
    /**
     * The user's Pocket access token.
     */
    @JsonProperty("access_token")public String accessToken;
    public SourcePocket withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")public SourcePocketPocketEnum airbyteSourceName;
    public SourcePocket withAirbyteSourceName(SourcePocketPocketEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Your application's Consumer Key.
     */
    @JsonProperty("consumer_key")public String consumerKey;
    public SourcePocket withConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }
    
    /**
     * Select the content type of the items to retrieve.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content_type")public SourcePocketContentTypeEnum contentType;
    public SourcePocket withContentType(SourcePocketContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Select the granularity of the information about each item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detail_type")public SourcePocketDetailTypeEnum detailType;
    public SourcePocket withDetailType(SourcePocketDetailTypeEnum detailType) {
        this.detailType = detailType;
        return this;
    }
    
    /**
     * Only return items from a particular `domain`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")public String domain;
    public SourcePocket withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    /**
     * Retrieve only favorited items.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("favorite")public Boolean favorite;
    public SourcePocket withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }
    
    /**
     * Only return items whose title or url contain the `search` string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search")public String search;
    public SourcePocket withSearch(String search) {
        this.search = search;
        return this;
    }
    
    /**
     * Only return items modified since the given timestamp.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("since")public String since;
    public SourcePocket withSince(String since) {
        this.since = since;
        return this;
    }
    
    /**
     * Sort retrieved items by the given criteria.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")public SourcePocketSortByEnum sort;
    public SourcePocket withSort(SourcePocketSortByEnum sort) {
        this.sort = sort;
        return this;
    }
    
    /**
     * Select the state of the items to retrieve.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")public SourcePocketStateEnum state;
    public SourcePocket withState(SourcePocketStateEnum state) {
        this.state = state;
        return this;
    }
    
    /**
     * Return only items tagged with this tag name. Use _untagged_ for retrieving only untagged items.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")public String tag;
    public SourcePocket withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
}

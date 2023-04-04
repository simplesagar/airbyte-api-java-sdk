/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGithub - The values required to configure the source.
 */
public class SourceGithub {
    @JsonProperty("airbyte-source-name")
    public SourceGithubGithubEnum airbyteSourceName;
    public SourceGithub withAirbyteSourceName(SourceGithubGithubEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public SourceGithub withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Choose how to authenticate to GitHub
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceGithub withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * The Github connector contains several streams with a large amount of data. The page size of such streams depends on the size of your repository. We recommended that you specify values between 10 and 30.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size_for_large_streams")
    public Long pageSizeForLargeStreams;
    public SourceGithub withPageSizeForLargeStreams(Long pageSizeForLargeStreams) {
        this.pageSizeForLargeStreams = pageSizeForLargeStreams;
        return this;
    }
    
    /**
     * Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
     */
    @JsonProperty("repository")
    public String repository;
    public SourceGithub withRepository(String repository) {
        this.repository = repository;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourceGithub withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
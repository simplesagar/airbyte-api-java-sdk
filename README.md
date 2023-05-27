<div align="center">
    <picture>
        <img src="https://user-images.githubusercontent.com/68016351/222853569-b35cc448-6481-4cf2-a237-bd5da47e94fd.png" width="500">
    </picture>
   <p>Programatically control Airbyte Cloud through an API.</p>
   <a href="https://reference.airbyte.com/reference/start"><img src="https://img.shields.io/static/v1?label=Docs&message=API Ref&color=000000&style=for-the-badge" /></a>
   <a href="https://github.com/airbytehq/airbyte-api-java-sdk/actions"><img src="https://img.shields.io/github/actions/workflow/status/airbytehq/airbyte-api-java-sdk/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" /></a>
  <a href="https://github.com/airbytehq/airbyte-api-java-sdk/releases"><img src="https://img.shields.io/github/v/release/airbytehq/airbyte-api-java-sdk?sort=semver&style=for-the-badge" /></a>
</div>

## Authentication

Developers will need to create an API Key within your [Developer Portal](https://portal.airbyte.com/) to make API requests. You can use your existing Airbyte account to log in to the Developer Portal. Once you are in the Developer Portal, use the API Keys tab to create or remove API Keys. You can see a [walkthrough demo here](https://www.loom.com/share/7997a7c67cd642cc8d1c72ef0dfcc4bc)🎦

The Developer Portal UI can also be used to help build your integration by showing information about network requests in the Requests tab. API usage information is also available to you in the Usage tab.

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'com.airbyte.api:public-api:0.13.1'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.ConnectionCreateRequest;
import com.airbyte.api.models.shared.ConnectionScheduleCreate;
import com.airbyte.api.models.shared.ConnectionSyncModeEnum;
import com.airbyte.api.models.shared.GeographyEnum;
import com.airbyte.api.models.shared.NamespaceDefinitionEnum;
import com.airbyte.api.models.shared.NonBreakingSchemaUpdatesBehaviorEnum;
import com.airbyte.api.models.shared.ScheduleTypeEnum;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.StreamConfiguration;
import com.airbyte.api.models.shared.StreamConfigurations;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("9bd9d8d6-9a67-44e0-b467-cc8796ed151a", "05dfc2dd-f7cc-478c-a1ba-928fc816742c") {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("saepe") {{
                            cursorField = new String[]{{
                                add("ipsum"),
                                add("excepturi"),
                            }};
                            name = "Dorothy Hane";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("natus"),
                                }}),
                                add(new String[]{{
                                    add("hic"),
                                    add("saepe"),
                                }}),
                                add(new String[]{{
                                    add("in"),
                                    add("corporis"),
                                    add("iste"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.FULL_REFRESH_APPEND;
                        }}),
                        add(new StreamConfiguration("excepturi") {{
                            cursorField = new String[]{{
                                add("architecto"),
                                add("ipsa"),
                                add("reiciendis"),
                            }};
                            name = "Shaun Osinski";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("nobis"),
                                }}),
                                add(new String[]{{
                                    add("omnis"),
                                    add("nemo"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.FULL_REFRESH_APPEND;
                        }}),
                        add(new StreamConfiguration("quia") {{
                            cursorField = new String[]{{
                                add("iure"),
                            }};
                            name = "Miss Aubrey Williamson";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("repellat"),
                                }}),
                                add(new String[]{{
                                    add("occaecati"),
                                    add("numquam"),
                                    add("commodi"),
                                }}),
                                add(new String[]{{
                                    add("molestiae"),
                                    add("velit"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                        }}),
                    }};
                }};;
                dataResidency = GeographyEnum.US;
                name = "Kayla O'Kon";
                namespaceDefinition = NamespaceDefinitionEnum.CUSTOM_FORMAT;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.IGNORE;
                prefix = "tenetur";
                schedule = new ConnectionScheduleCreate(ScheduleTypeEnum.MANUAL) {{
                    cronExpression = "id";
                }};;
            }};            

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [connections](docs/connections/README.md)

* [createConnection](docs/connections/README.md#createconnection) - Create a connection
* [deleteConnection](docs/connections/README.md#deleteconnection) - Delete a Connection
* [getConnection](docs/connections/README.md#getconnection) - Get Connection details
* [listConnections](docs/connections/README.md#listconnections) - List connections

### [destinations](docs/destinations/README.md)

* [createDestination](docs/destinations/README.md#createdestination) - Create a destination
* [deleteDestination](docs/destinations/README.md#deletedestination) - Delete a Destination
* [getDestination](docs/destinations/README.md#getdestination) - Get Destination details
* [listDestinations](docs/destinations/README.md#listdestinations) - List destinations

### [jobs](docs/jobs/README.md)

* [cancelJob](docs/jobs/README.md#canceljob) - Cancel a running Job
* [createJob](docs/jobs/README.md#createjob) - Trigger a sync or reset job of a connection
* [getJob](docs/jobs/README.md#getjob) - Get Job status and details
* [listJobs](docs/jobs/README.md#listjobs) - List Jobs by sync type

### [sources](docs/sources/README.md)

* [createSource](docs/sources/README.md#createsource) - Create a source
* [deleteSource](docs/sources/README.md#deletesource) - Delete a Source
* [getSource](docs/sources/README.md#getsource) - Get Source details
* [initiateOAuth](docs/sources/README.md#initiateoauth) - Initiate OAuth for a source
* [listSources](docs/sources/README.md#listsources) - List sources

### [streams](docs/streams/README.md)

* [getStreamProperties](docs/streams/README.md#getstreamproperties) - Get stream properties

### [workspaces](docs/workspaces/README.md)

* [createOrUpdateWorkspaceOAuthCredentials](docs/workspaces/README.md#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](docs/workspaces/README.md#createworkspace) - Create a workspace
* [deleteWorkspace](docs/workspaces/README.md#deleteworkspace) - Delete a Workspace
* [getWorkspace](docs/workspaces/README.md#getworkspace) - Get Workspace details
* [listWorkspaces](docs/workspaces/README.md#listworkspaces) - List workspaces
* [updateWorkspace](docs/workspaces/README.md#updateworkspace) - Update a workspace
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

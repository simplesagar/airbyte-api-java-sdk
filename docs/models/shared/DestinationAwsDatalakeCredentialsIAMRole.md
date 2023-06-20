# DestinationAwsDatalakeCredentialsIAMRole

Choose How to Authenticate to AWS.


## Fields

| Field                                                                                                                                       | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `credentialsTitle`                                                                                                                          | [DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitle](../../models/shared/DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitle.md) | :heavy_check_mark:                                                                                                                          | Name of the credentials                                                                                                                     |
| `roleArn`                                                                                                                                   | *String*                                                                                                                                    | :heavy_check_mark:                                                                                                                          | Will assume this role to write data to s3                                                                                                   |
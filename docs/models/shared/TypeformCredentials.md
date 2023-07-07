# TypeformCredentials


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `accessToken`                                                                             | *String*                                                                                  | :heavy_minus_sign:                                                                        | Access Token for making authenticated requests.                                           |
| `clientId`                                                                                | *String*                                                                                  | :heavy_minus_sign:                                                                        | The Client ID of the Typeform developer application.                                      |
| `clientSecret`                                                                            | *String*                                                                                  | :heavy_minus_sign:                                                                        | The Client Secret the Typeform developer application.                                     |
| `refreshToken`                                                                            | *String*                                                                                  | :heavy_minus_sign:                                                                        | The key to refresh the expired access_token.                                              |
| `tokenExpiryDate`                                                                         | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | The date-time when the access token should be refreshed.                                  |
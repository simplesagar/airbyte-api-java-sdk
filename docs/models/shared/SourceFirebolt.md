# SourceFirebolt

The values required to configure the source.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `account`                                                               | *String*                                                                | :heavy_minus_sign:                                                      | Firebolt account to login.                                              |                                                                         |
| `database`                                                              | *String*                                                                | :heavy_check_mark:                                                      | The database to connect to.                                             |                                                                         |
| `engine`                                                                | *String*                                                                | :heavy_minus_sign:                                                      | Engine name or url to connect to.                                       |                                                                         |
| `host`                                                                  | *String*                                                                | :heavy_minus_sign:                                                      | The host name of your Firebolt database.                                | api.app.firebolt.io                                                     |
| `password`                                                              | *String*                                                                | :heavy_check_mark:                                                      | Firebolt password.                                                      |                                                                         |
| `sourceType`                                                            | [SourceFireboltFirebolt](../../models/shared/SourceFireboltFirebolt.md) | :heavy_check_mark:                                                      | N/A                                                                     |                                                                         |
| `username`                                                              | *String*                                                                | :heavy_check_mark:                                                      | Firebolt email address you use to login.                                | username@email.com                                                      |
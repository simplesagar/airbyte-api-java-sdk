# SourceMailgun

The values required to configure the source.


## Fields

| Field                                                                                                                                      | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                | Example                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `domainRegion`                                                                                                                             | *String*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | Domain region code. 'EU' or 'US' are possible values. The default is 'US'.                                                                 |                                                                                                                                            |
| `privateKey`                                                                                                                               | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | Primary account API key to access your Mailgun data.                                                                                       |                                                                                                                                            |
| `sourceType`                                                                                                                               | [SourceMailgunMailgun](../../models/shared/SourceMailgunMailgun.md)                                                                        | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |                                                                                                                                            |
| `startDate`                                                                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                  | :heavy_minus_sign:                                                                                                                         | UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago. | 2020-10-01 00:00:00                                                                                                                        |
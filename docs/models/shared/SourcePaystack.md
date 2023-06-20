# SourcePaystack

The values required to configure the source.


## Fields

| Field                                                                                                                                                       | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 | Example                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `lookbackWindowDays`                                                                                                                                        | *Long*                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                          | When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation. |                                                                                                                                                             |
| `secretKey`                                                                                                                                                 | *String*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                          | The Paystack API key (usually starts with 'sk_live_'; find yours <a href="https://dashboard.paystack.com/#/settings/developer">here</a>).                   |                                                                                                                                                             |
| `sourceType`                                                                                                                                                | [SourcePaystackPaystack](../../models/shared/SourcePaystackPaystack.md)                                                                                     | :heavy_check_mark:                                                                                                                                          | N/A                                                                                                                                                         |                                                                                                                                                             |
| `startDate`                                                                                                                                                 | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                   | :heavy_check_mark:                                                                                                                                          | UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.                                                     | 2017-01-25T00:00:00Z                                                                                                                                        |
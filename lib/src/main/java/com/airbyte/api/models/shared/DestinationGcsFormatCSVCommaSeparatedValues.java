/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatCSVCommaSeparatedValues - Output data format. One of the following formats must be selected - &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-avro#advantages_of_avro"&gt;AVRO&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-parquet#parquet_schemas"&gt;PARQUET&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-csv#loading_csv_data_into_a_table"&gt;CSV&lt;/a&gt; format, or &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-json#loading_json_data_into_a_new_table"&gt;JSONL&lt;/a&gt; format.
 */
public class DestinationGcsFormatCSVCommaSeparatedValues {
    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    public Object compression;
    public DestinationGcsFormatCSVCommaSeparatedValues withCompression(Object compression) {
        this.compression = compression;
        return this;
    }
    
    /**
     * Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flattening")
    public DestinationGcsFormatCSVCommaSeparatedValuesNormalizationEnum flattening;
    public DestinationGcsFormatCSVCommaSeparatedValues withFlattening(DestinationGcsFormatCSVCommaSeparatedValuesNormalizationEnum flattening) {
        this.flattening = flattening;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationGcsFormatCSVCommaSeparatedValuesFormatTypeEnum formatType;
    public DestinationGcsFormatCSVCommaSeparatedValues withFormatType(DestinationGcsFormatCSVCommaSeparatedValuesFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
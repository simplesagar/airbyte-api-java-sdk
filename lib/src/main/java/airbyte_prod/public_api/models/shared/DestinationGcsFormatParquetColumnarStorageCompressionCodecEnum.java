/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationGcsFormatParquetColumnarStorageCompressionCodecEnum - The compression algorithm used to compress data pages.
 */
public enum DestinationGcsFormatParquetColumnarStorageCompressionCodecEnum {
    UNCOMPRESSED("UNCOMPRESSED"),
    SNAPPY("SNAPPY"),
    GZIP("GZIP"),
    LZO("LZO"),
    BROTLI("BROTLI"),
    LZ4("LZ4"),
    ZSTD("ZSTD");

    @JsonValue
    public final String value;

    private DestinationGcsFormatParquetColumnarStorageCompressionCodecEnum(String value) {
        this.value = value;
    }
}
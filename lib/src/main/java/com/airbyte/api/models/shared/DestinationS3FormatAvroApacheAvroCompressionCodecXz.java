/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecXz - The compression algorithm used to compress data. Default to no compression.
 */
public class DestinationS3FormatAvroApacheAvroCompressionCodecXz {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecXzCodec codec;

    public DestinationS3FormatAvroApacheAvroCompressionCodecXz withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecXzCodec codec) {
        this.codec = codec;
        return this;
    }
    
    /**
     * See &lt;a href="https://commons.apache.org/proper/commons-compress/apidocs/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.html#XZCompressorOutputStream-java.io.OutputStream-int-"&gt;here&lt;/a&gt; for details.
     */
    @JsonProperty("compression_level")
    public Long compressionLevel;

    public DestinationS3FormatAvroApacheAvroCompressionCodecXz withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
    public DestinationS3FormatAvroApacheAvroCompressionCodecXz(@JsonProperty("codec") DestinationS3FormatAvroApacheAvroCompressionCodecXzCodec codec, @JsonProperty("compression_level") Long compressionLevel) {
        this.codec = codec;
        this.compressionLevel = compressionLevel;
  }
}

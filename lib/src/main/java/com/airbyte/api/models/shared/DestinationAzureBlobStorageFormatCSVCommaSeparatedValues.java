/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAzureBlobStorageFormatCSVCommaSeparatedValues - Output data format
 */
public class DestinationAzureBlobStorageFormatCSVCommaSeparatedValues {
    /**
     * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    @JsonProperty("flattening")
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum flattening;

    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues withFlattening(DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum flattening) {
        this.flattening = flattening;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum formatType;

    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues withFormatType(DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues(@JsonProperty("flattening") DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum flattening, @JsonProperty("format_type") DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum formatType) {
        this.flattening = flattening;
        this.formatType = formatType;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceFacebookMarketingInsightConfigValidActionBreakdownsEnum - Generic enumeration.
 * 
 * Derive from this class to define new enumerations.
 */
public enum SourceFacebookMarketingInsightConfigValidActionBreakdownsEnum {
    ACTION_CANVAS_COMPONENT_NAME("action_canvas_component_name"),
    ACTION_CAROUSEL_CARD_ID("action_carousel_card_id"),
    ACTION_CAROUSEL_CARD_NAME("action_carousel_card_name"),
    ACTION_DESTINATION("action_destination"),
    ACTION_DEVICE("action_device"),
    ACTION_REACTION("action_reaction"),
    ACTION_TARGET_ID("action_target_id"),
    ACTION_TYPE("action_type"),
    ACTION_VIDEO_SOUND("action_video_sound"),
    ACTION_VIDEO_TYPE("action_video_type");

    @JsonValue
    public final String value;

    private SourceFacebookMarketingInsightConfigValidActionBreakdownsEnum(String value) {
        this.value = value;
    }
}
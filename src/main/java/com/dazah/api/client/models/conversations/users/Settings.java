package com.dazah.api.client.models.conversations.users;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class Settings {
    private String locationImportance;
    private String introduction;
    private int timezone;

    @JsonProperty("location_importance")
    public String getLocationImportance() {
        return locationImportance;
    }

    public void setLocationImportance(String locationImportance) {
        this.locationImportance = locationImportance;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }
}

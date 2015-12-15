package com.dazah.api.client.models.conversations.users;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class Location {
    private String linkedinLocation;
    private String city;
    private String region;
    private String country;

    @JsonProperty("linkedin_location")
    public String getLinkedinLocation() {
        return linkedinLocation;
    }

    public void setLinkedinLocation(String linkedinLocation) {
        this.linkedinLocation = linkedinLocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

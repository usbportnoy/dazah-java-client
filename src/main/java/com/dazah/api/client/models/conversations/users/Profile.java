package com.dazah.api.client.models.conversations.users;

import org.codehaus.jackson.annotate.JsonProperty;

import java.net.URL;
import java.util.List;

/**
 * Created by usbportnoy on 12/12/15.
 */
public class Profile {
    private String firstName;
    private String lastName;
    private String headline;
    private String industry;
    private String pitch;
    private URL company;
    private URL linkedIn;
    private List<String> goals;

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    @JsonProperty("company_url")
    public URL getCompany() {
        return company;
    }


    public void setCompany(URL company) {
        this.company = company;
    }

    @JsonProperty("linkedin_url")
    public URL getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(URL linkedIn) {
        this.linkedIn = linkedIn;
    }

    public List<String> getGoals() {
        return goals;
    }

    public void setGoals(List<String> goals) {
        this.goals = goals;
    }
}

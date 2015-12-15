package com.dazah.api.client.models.conversations;

import com.dazah.api.client.models.conversations.users.*;
import com.dazah.api.client.models.conversations.users.Usage;

import java.net.URL;

/**
 * Created by usbportnoy on 12/12/15.
 */
public class User {
    private int id;
    private Profile profile;
    private Settings settings;
    private Location location;
    private URL thumbshot;
    private URL thumbnail;
    private URL picture;
    private URL url;
    private com.dazah.api.client.models.conversations.users.Usage usage;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public URL getThumbshot() {
        return thumbshot;
    }

    public void setThumbshot(URL thumbshot) {
        this.thumbshot = thumbshot;
    }

    public URL getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(URL thumbnail) {
        this.thumbnail = thumbnail;
    }

    public URL getPicture() {
        return picture;
    }

    public void setPicture(URL picture) {
        this.picture = picture;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}

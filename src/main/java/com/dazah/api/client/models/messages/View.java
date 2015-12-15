package com.dazah.api.client.models.messages;

import com.dazah.api.client.models.conversations.User;

import java.util.Date;

/**
 * Created by usbportnoy on 12/13/15.
 */
//todo view is bad name
public class View {
    private User user;
    private Date timestamp;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

package com.dazah.api.client.models.conversations.statuses;

import com.dazah.api.client.models.conversations.User;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by usbportnoy on 12/14/15.
 */
public class Status extends Response{
    private int newMessageCount;
    private User user;

    @JsonProperty("new_message_count")
    public int getNewMessageCount() {
        return newMessageCount;
    }

    public void setNewMessageCount(int newMessageCount) {
        this.newMessageCount = newMessageCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

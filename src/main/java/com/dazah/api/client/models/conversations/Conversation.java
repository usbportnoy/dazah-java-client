package com.dazah.api.client.models.conversations;

import com.dazah.api.client.models.AbstractEntity;
import com.dazah.api.client.models.messages.View;
import org.codehaus.jackson.annotate.JsonProperty;

import java.net.URL;

/**
 * Created by usbportnoy on 12/12/15.
 */
public class Conversation extends AbstractEntity {
    private URL url;
    private int newMessageCount;
    private Usage usage;
    private boolean archived;
    private User userA;
    private User userB;
    private View firstMessage;
    private View latestMessage;

    @JsonProperty("archived_status")
    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @JsonProperty("new_message_count")
    public int getNewMessageCount() {
        return newMessageCount;
    }

    public void setNewMessageCount(int newMessageCount) {
        this.newMessageCount = newMessageCount;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    @JsonProperty("user_a")
    public User getUserA() {
        return userA;
    }

    public void setUserA(User userA) {
        this.userA = userA;
    }

    @JsonProperty("user_b")
    public User getUserB() {
        return userB;
    }

    public void setUserB(User userB) {
        this.userB = userB;
    }

    @JsonProperty("first_message")
    public View getFirstMessage() {
        return firstMessage;
    }

    public void setFirstMessage(View firstMessage) {
        this.firstMessage = firstMessage;
    }

    @JsonProperty("latest_message")
    public View getLatestMessage() {
        return latestMessage;
    }

    public void setLatestMessage(View latestMessage) {
        this.latestMessage = latestMessage;
    }
}

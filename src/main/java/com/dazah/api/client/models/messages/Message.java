package com.dazah.api.client.models.messages;

import com.dazah.api.client.models.AbstractEntity;
import com.dazah.api.client.models.conversations.Conversation;
import com.dazah.api.client.models.conversations.User;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class Message extends AbstractEntity {
    private Date timestamp;
    private User author;
    private Conversation conversation;
    private Contents message;
    private View lastSeen;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public Contents getMessage() {
        return message;
    }

    public void setMessage(Contents message) {
        this.message = message;
    }

    @JsonProperty("last_seen")
    public View getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(View lastSeen) {
        this.lastSeen = lastSeen;
    }
}

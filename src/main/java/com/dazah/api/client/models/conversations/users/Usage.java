package com.dazah.api.client.models.conversations.users;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class Usage {
    private Date joinedTimestamp;
    private Date lastActivityTimestamp;
    private boolean onlineStatus;

    @JsonProperty("joined_timestamp")
    public Date getJoinedTimestamp() {
        return joinedTimestamp;
    }

    public void setJoinedTimestamp(Date joinedTimestamp) {
        this.joinedTimestamp = joinedTimestamp;
    }

    @JsonProperty("last_activity_timestamp")
    public Date getLastActivityTimestamp() {
        return lastActivityTimestamp;
    }

    public void setLastActivityTimestamp(Date lastActivityTimestamp) {
        this.lastActivityTimestamp = lastActivityTimestamp;
    }

    @JsonProperty("online_status")
    public boolean isOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
    }
}

package com.dazah.api.client.models.conversations;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.util.Date;

/**
 * Created by usbportnoy on 12/12/15.
 */
public class Usage {

    private Date started;

    @JsonProperty("started_timestamp")
    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }
}

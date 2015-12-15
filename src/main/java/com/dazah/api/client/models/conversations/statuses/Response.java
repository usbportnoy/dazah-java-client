package com.dazah.api.client.models.conversations.statuses;

import java.util.List;

/**
 * Created by usbportnoy on 12/14/15.
 */
public class Response extends com.dazah.api.client.models.Response {
   private List<Status> data;

    public List<Status> getData() {
        return data;
    }

    public void setData(List<Status> data) {
        this.data = data;
    }
}

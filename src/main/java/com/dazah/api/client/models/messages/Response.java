package com.dazah.api.client.models.messages;

import java.util.List;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class Response extends com.dazah.api.client.models.Response{
    private List<Message> data;

    public List<Message> getData() {
        return data;
    }

    public void setData(List<Message> data) {
        this.data = data;
    }
}

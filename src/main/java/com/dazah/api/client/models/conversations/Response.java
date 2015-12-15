package com.dazah.api.client.models.conversations;

import java.util.List;

/**
 * Created by usbportnoy on 12/12/15.
 */
public class Response extends com.dazah.api.client.models.Response{
    private List<Conversation> data;

    public List<Conversation> getData() {
        return data;
    }

    public void setData(List<Conversation> data) {
        this.data = data;
    }
}

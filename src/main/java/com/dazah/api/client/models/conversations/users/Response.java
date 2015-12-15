package com.dazah.api.client.models.conversations.users;

import com.dazah.api.client.models.conversations.User;

import java.util.List;

/**
 * Created by usbportnoy on 12/15/15.
 */
public class Response extends com.dazah.api.client.models.Response {
    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}

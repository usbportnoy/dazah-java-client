package com.dazah.api.client.models;

import java.util.List;

/**
 * Created by usbportnoy on 12/15/15.
 */
public class SingleResponse<T> extends Response {
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

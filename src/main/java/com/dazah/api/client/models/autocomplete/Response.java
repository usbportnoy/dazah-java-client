package com.dazah.api.client.models.autocomplete;

import java.util.List;

/**
 * Created by usbportnoy on 12/12/15.
 */
public class Response extends com.dazah.api.client.models.Response {
    private List<CategoryResult> data;

    public List<CategoryResult> getData() {
        return data;
    }

    public void setData(List<CategoryResult> data) {
        this.data = data;
    }
}

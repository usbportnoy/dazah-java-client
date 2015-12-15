package com.dazah.api.client.models.autocomplete;

import java.net.URL;

/**
 * Created by usbportnoy on 12/9/15.
 */
public class Result {
    private String label;
    private URL url;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}

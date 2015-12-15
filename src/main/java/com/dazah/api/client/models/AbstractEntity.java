package com.dazah.api.client.models;

/**
 * Created by usbportnoy on 12/14/15.
 */
public abstract class AbstractEntity {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

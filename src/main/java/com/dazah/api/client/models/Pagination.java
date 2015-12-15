package com.dazah.api.client.models;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by usbportnoy on 12/13/15.
 */
public class Pagination {
//    "pagination": {
//        "total_records": "4",
//                "per_page": 50,
//                "current_offset": 0
//    },

    private int totalRecords;
    private int perPage;
    private int currentOffset;

    @JsonProperty("total_records")
    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    @JsonProperty("per_page")
    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    @JsonProperty("current_offset")
    public int getCurrentOffset() {
        return currentOffset;
    }

    public void setCurrentOffset(int currentOffset) {
        this.currentOffset = currentOffset;
    }
}

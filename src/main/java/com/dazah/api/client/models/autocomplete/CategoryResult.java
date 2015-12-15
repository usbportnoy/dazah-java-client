package com.dazah.api.client.models.autocomplete;

import java.util.List;

/**
 * Created by usbportnoy on 12/9/15.
 */
public class CategoryResult {
    private String category;
    private List<Result> results;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}

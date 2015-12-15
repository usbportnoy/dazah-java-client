package com.dazah.api.client.models;

import com.dazah.api.client.models.autocomplete.CategoryResult;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by usbportnoy on 12/9/15.
 */
@JsonIgnoreProperties
public abstract class Response {
    private Float executionTime;
    private Boolean success;
    private String error;
    private Pagination pagination;

    @JsonProperty("execution_time")
    public Float getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Float executionTime) {
        this.executionTime = executionTime;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}

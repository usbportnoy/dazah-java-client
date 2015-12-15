package com.dazah.api.client.models;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by usbportnoy on 12/9/15.
 */
@JsonIgnoreProperties
public class Response {
    protected Float executionTime;
    protected Boolean success;
    protected String error;
    protected Pagination pagination;

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

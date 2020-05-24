package com.payme.paymeApi.model;

public class ApiResponse {
    String endpoint;
    int status;

    public ApiResponse(String endpoint, int status) {
        this.endpoint = endpoint;
        this.status = status;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

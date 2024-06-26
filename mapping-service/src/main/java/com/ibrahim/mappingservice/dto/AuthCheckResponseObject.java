package com.ibrahim.mappingservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AuthCheckResponseObject {

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public AuthCheckResponseObject() {
        super();
    }


    public AuthCheckResponseObject(boolean success) {
        super();
        this.success = success;
    }


}
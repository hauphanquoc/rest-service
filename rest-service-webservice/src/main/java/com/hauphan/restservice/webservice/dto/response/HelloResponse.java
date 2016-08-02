package com.hauphan.restservice.webservice.dto.response;


import java.io.Serializable;

public class HelloResponse implements Serializable{

    private static final long serialVersionUID = -9094209336603376727L;

    private String status;
    private String name;

    public HelloResponse(String name) {
        this.status = "OK";
        this.name = name;
    }

    public HelloResponse(String status, String name) {
        this.status = status;
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

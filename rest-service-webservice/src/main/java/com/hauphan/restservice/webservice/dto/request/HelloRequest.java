package com.hauphan.restservice.webservice.dto.request;


import java.io.Serializable;

public class HelloRequest implements Serializable{

    private static final long serialVersionUID = 69719696147658532L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.hauphan.restservice.webservice.controller;


import com.hauphan.restservice.webservice.dto.request.HelloRequest;
import com.hauphan.restservice.webservice.dto.response.HelloResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping () {
        return "pong";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public HelloResponse sayHello (String status, String name) {
        return new HelloResponse(status, name);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public HelloResponse sayHello (@RequestBody HelloRequest helloRequest) {

        return new HelloResponse(helloRequest.getName());
    }

}

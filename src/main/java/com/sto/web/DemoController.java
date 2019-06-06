package com.sto.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String index(HttpRequest request){
        System.out.println(request);
        String methodValue = request.getMethodValue();
        System.out.println("methodValue :"+methodValue);
        URI requestURI = request.getURI();
        System.out.println("requestURI :"+requestURI);
        HttpHeaders headers = request.getHeaders();
        System.out.println("headers :"+headers);
        return request.toString();
    }
}

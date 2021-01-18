package pro.bolshakov.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port:8080}")
    private int serverPort;

    @GetMapping("")
    public String sayHello(){
        return "Hello from app {" + appName + "}. It is on port {" + serverPort + "}";
    }

}

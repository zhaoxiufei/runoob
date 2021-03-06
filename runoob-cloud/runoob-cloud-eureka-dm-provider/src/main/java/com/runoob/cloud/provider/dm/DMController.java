package com.runoob.cloud.provider.dm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DMController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${zhao.xiu.fei}")
    private String test;

    @GetMapping("/service")
    public String service() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        System.out.println(test);
        return services;
    }
}

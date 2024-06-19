package com.sapient.asde.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-producer",fallback = HelloFallback.class)
public interface HelloService {

    @RequestMapping("/hellop/greet")
    public String getGreetings();
}

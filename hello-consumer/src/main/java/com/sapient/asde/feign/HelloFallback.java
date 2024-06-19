package com.sapient.asde.feign;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelloFallback implements HelloService{
    @Override
    public String getGreetings() {
        return "Currently the service is down";
    }
}

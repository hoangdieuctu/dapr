package com.hoangdieuctu.serviceb.downstream;

import com.hoangdieuctu.serviceb.dto.HelloDto;
import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import io.dapr.client.domain.HttpExtension;
import org.springframework.stereotype.Service;

@Service
public class ServiceACaller {

    private static final String SERVICE_NAME = "service-a";

    private final DaprClient client;

    public ServiceACaller() {
        this.client = new DaprClientBuilder().build();
    }

    public HelloDto sayHello() {
        return client.invokeMethod(SERVICE_NAME, "hello", "", HttpExtension.GET, HelloDto.class).block();
    }
}

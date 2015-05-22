package io.sandbox.rest.config;

import io.sandbox.rest.endpoint.DummyEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(DummyEndpoint.class);
    }

}

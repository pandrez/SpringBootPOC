package io.sandbox.rest.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
@Produces("application/json")
public class DummyEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(DummyEndpoint.class);

    @GET
    public String message() {
        return "Hello World";
    }
}
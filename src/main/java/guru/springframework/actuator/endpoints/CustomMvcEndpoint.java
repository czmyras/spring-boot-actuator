package guru.springframework.actuator.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;
import org.springframework.stereotype.Component;

@Component
public class CustomMvcEndpoint extends EndpointMvcAdapter {

    @Autowired
    public CustomMvcEndpoint(CustomEndpoint customEndpoint) {
        super(customEndpoint);
    }
}

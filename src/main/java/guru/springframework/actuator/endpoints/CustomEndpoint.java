package guru.springframework.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomEndpoint extends AbstractEndpoint<List<String>> {


    public CustomEndpoint() {
        super("customEndpoint", false);
    }

    @Override
    public List<String> invoke() {
        List<String> list = new ArrayList<>();
        list.add("Chuck Norris");
        list.add("was here");
        return list;
    }
}

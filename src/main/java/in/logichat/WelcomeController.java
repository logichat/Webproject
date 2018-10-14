package in.logichat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message = "Hello World";

    @RequestMapping("/hello")
    public String welcome(Map<String, Object> model) {
        return "welcome";
    }

}


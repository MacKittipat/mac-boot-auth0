package bootauth0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

    @GetMapping("public/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("private/greeting")
    public String greeting() {
        return "Greeting";
    }

}

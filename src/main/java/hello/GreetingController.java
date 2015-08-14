package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Kamil on 2015-08-13.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting greeting(@RequestParam(value="name", defaultValue ="World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

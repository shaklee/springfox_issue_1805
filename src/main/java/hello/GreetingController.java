package hello;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping(path = "/greeting", method = POST)
	public Greeting save(Greeting greet) {
		return greet;
	}

	@RequestMapping(path = "/greetingWithRequestBody", method = POST)
	public Greeting withRequestBody(@RequestBody Greeting greet) {
		return greet;
	}

	@RequestMapping(path = "/greetingWithModelAttribute", method = POST)
	public Greeting withModelAttribute(@ModelAttribute Greeting greet) {
		return greet;
	}
}
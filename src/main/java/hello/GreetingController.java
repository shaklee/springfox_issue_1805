package hello;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping(path = "/greeting", method = POST)
	public Greeting save(Greeting g) {
		return g;
	}

	@RequestMapping(path = "/greetingWithModelAttribute", method = POST)
	public Greeting withModelAttribute(@ModelAttribute Greeting g) {
		return g; 
	}
}
package mumScheduler.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
	@RequestMapping("/entries")
	public String entries() {
		//this by default always returns a json file to the browser
		return "list of entries";
	}
}

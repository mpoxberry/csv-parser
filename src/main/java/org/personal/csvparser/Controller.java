package org.personal.csvparser;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Controller {
	
	@GetMapping(path = "/ping", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String ping() {
		return "{\"name\": \"ping\"}";
	}
}

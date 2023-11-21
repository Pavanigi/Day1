package com.cg.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "<h1> Hi  world!</h1>";
	}


}

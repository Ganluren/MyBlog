package net.xu.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontPageController {
	@GetMapping("/")
	public String index() {
		return "/front/index.html";
	}

	@GetMapping("/index")
	public String toIndex() {
		return "/front/index.html";
	}
}

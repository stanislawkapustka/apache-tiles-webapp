package pl.skapustka.jba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(name = "/")
	public String index(){
		return "index";
	}

}

package noobs.bis.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageDemoController {
	
	@GetMapping("/index")
	public String index(String str) {
		return "/index.html";
	}
	
}

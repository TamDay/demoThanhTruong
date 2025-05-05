package thanh.tam.truong.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String test ()
	{
		return "vvv";
	}
	@PostMapping("/addsv")
	public String test1 (@RequestParam String name)
	{
		return name;
	}
}

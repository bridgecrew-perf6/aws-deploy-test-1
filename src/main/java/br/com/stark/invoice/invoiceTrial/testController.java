package br.com.stark.invoice.invoiceTrial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

	@PostMapping("/push")
	public void index(@RequestBody String json) {
		System.out.println("Funcionou!!!");
		System.out.println(json);
	}
	
	@GetMapping("/push")
	public void index() {
		System.out.println("Funcionou.");
	}
}

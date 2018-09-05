package manosb1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/")
	public String print() {
		return "Manohari Anil";
	}

}

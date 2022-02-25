package de.telekom.sea7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerThymeleaf {

	@GetMapping("/")
//@ResponseBody -> wird aufgrund von Thymeleaf nicht mehr benötigt
		public String home(Model model,
			@RequestParam(value = "name",
					required = false,
					defaultValue = "World") String name

	) {

		model.addAttribute("name", name);

		return "home";

	}
}

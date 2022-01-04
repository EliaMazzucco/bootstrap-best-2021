package org.generation.italy.controller;

import java.util.Arrays;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
	private static final String AUTHOR= "author";
	private static final String NAME="Elia - Gruppo 2";

	@GetMapping
	public String index(Model model) {
		model.addAttribute(AUTHOR, NAME);
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute(AUTHOR, NAME);
		model.addAttribute("title", "Movies");
		model.addAttribute("list", Arrays.asList("Harry Potter e la pietra filosofale", "Arancia Meccanica", "Il Signore degli anelli - Le due torri", "Diabolik", "Limitless", "Il Buco"));
		return "list";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute(AUTHOR, NAME);
		model.addAttribute("title", "Songs");
		model.addAttribute("list", Arrays.asList("Come Together - The Beatles", "Litty - Meek Mill feat Tory Lanez", "3500 - Travis Scott feat Future feat 2 Chainz", "Roma - Achille Lauro feat Simon P remix by Boss Doms", "VVS & Molly - Thelonious B", "TEE - JAY1 feat Loski"));
		return "list";
	}
}

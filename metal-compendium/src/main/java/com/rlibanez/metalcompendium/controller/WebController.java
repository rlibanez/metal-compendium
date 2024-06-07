package com.rlibanez.metalcompendium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rlibanez.metalcompendium.repository.SectionRepository;
import com.rlibanez.metalcompendium.service.SectionService;

@Controller
public class WebController {
	
	private final SectionService sectionService;

	public WebController(SectionService sectionService) {
		this.sectionService = sectionService;
	}
	
	@GetMapping("/")
	public String welcome(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "index";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "index";
	}
	
	
}

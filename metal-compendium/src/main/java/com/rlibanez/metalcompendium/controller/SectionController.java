package com.rlibanez.metalcompendium.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlibanez.metalcompendium.model.Section;
import com.rlibanez.metalcompendium.service.SectionService;

@RestController
@RequestMapping("/api/sections")
public class SectionController {

	private final SectionService sectionService;

	public SectionController(SectionService sectionService) {
		this.sectionService = sectionService;
	}

	@GetMapping("/")
    public List<Section> getAllUsers() {
        return sectionService.getAllSections();
    }

    @GetMapping("/{name}")
    public Section getUserById(@PathVariable String name) {
        return sectionService.getSectionByName(name);
    }
    
}

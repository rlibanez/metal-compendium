package com.rlibanez.metalcompendium.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Section> getAllSections() {
        return sectionService.getAllSections();
    }

    @GetMapping
    public List<Section> getSectionByType(@RequestParam String type) {
        return sectionService.getSectionsByType(type);
    }
    
}

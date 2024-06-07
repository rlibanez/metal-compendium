package com.rlibanez.metalcompendium.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	// /api/sections/all
	@GetMapping("/all")
    public List<Section> getAllSections() {
        return sectionService.getAllSections();
    }
	
	// /api/sections/ipn100
	@GetMapping("{name}")
	public Section getSectionsByName(@PathVariable String name) {
		return sectionService.getSectionsByName(name);
	}

	// /api/sections?start=ipn100
    @GetMapping
    public List<Section> getSectionsByPartialName(@RequestParam(required = false) String start,
            @RequestParam(required = false) String contain,
            @RequestParam(required = false) String end) {
    	if(start != null) {
    		return sectionService.getSectionsByStartingWith(start);
    	} else if(contain != null){
    		return sectionService.getSectionsByContainingName(contain);
    	} else if(end != null){
    		return sectionService.getSectionsByEndingWith(end);
    	} else {
    		return sectionService.getAllSections();
    	}
    }
    
}

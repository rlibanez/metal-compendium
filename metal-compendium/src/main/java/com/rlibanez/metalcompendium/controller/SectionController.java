package com.rlibanez.metalcompendium.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlibanez.metalcompendium.service.SectionService;

@RestController
@RequestMapping("/api/sections")
public class SectionController {

	private final SectionService sectionService;

	public SectionController(SectionService sectionService) {
		this.sectionService = sectionService;
	}

}

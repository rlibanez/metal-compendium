package com.rlibanez.metalcompendium.service;

import org.springframework.stereotype.Service;

import com.rlibanez.metalcompendium.repository.SectionRepository;

@Service
public class SectionService {
	
	private final SectionRepository sectionRepository;

	public SectionService(SectionRepository sectionRepository) {
		this.sectionRepository = sectionRepository;
	}

}

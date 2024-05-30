package com.rlibanez.metalcompendium.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rlibanez.metalcompendium.model.Section;
import com.rlibanez.metalcompendium.repository.SectionRepository;

@Service
public class SectionService {
	
	private final SectionRepository sectionRepository;

	public SectionService(SectionRepository sectionRepository) {
		this.sectionRepository = sectionRepository;
	}
	
	public List<Section> getAllSections() {
        return sectionRepository.findAll();
    }
	
	public Section getSectionByName(String name) {
        return sectionRepository.findByNameContaining(name);
	}

}

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
        return sectionRepository.findAllByOrderByName();
    }
	
	public List<Section> getSectionsByContainingName(String name) {
        return sectionRepository.findByNameContainingOrderByH(name);
	}
	
	public List<Section> getSectionsByStartingWith(String start) {
        return sectionRepository.findByNameStartingWithOrderByH(start);
    }
	
	public List<Section> getSectionsByEndingWith(String end) {
        return sectionRepository.findByNameEndingWithOrderByH(end);
    }

}

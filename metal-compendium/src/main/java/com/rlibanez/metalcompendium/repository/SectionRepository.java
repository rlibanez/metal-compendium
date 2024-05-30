package com.rlibanez.metalcompendium.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlibanez.metalcompendium.model.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, String> {
	
	List<Section> findAll();
	
	Section findByNameContaining(String name);
	
	List<Section> findByNameStartingWith(String type);
	
}

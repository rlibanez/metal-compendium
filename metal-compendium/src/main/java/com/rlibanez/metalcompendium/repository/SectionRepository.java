package com.rlibanez.metalcompendium.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlibanez.metalcompendium.model.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, String> {
	
	List<Section> findAllByOrderByName();
	
	Section findByName(String name);
	
	List<Section> findByNameContainingOrderByH(String name);
	
	List<Section> findByNameStartingWithOrderByH(String start);
	
	List<Section> findByNameEndingWithOrderByH(String end);
	
}

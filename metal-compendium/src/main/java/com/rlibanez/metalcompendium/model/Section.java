package com.rlibanez.metalcompendium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "section")
public class Section {
	@Id
	private String name;

	public Section() {
	}

}

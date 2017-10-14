package com.mum.schdu.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Block {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String blockMonth;
	private LocalDate blockStartDate;
	private LocalDate blockEndDate;
	
	//private List<Section> sections;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBlockMonth() {
		return blockMonth;
	}

	public void setBlockMonth(String blockMonth) {
		this.blockMonth = blockMonth;
	}

	public LocalDate getBlockStartDate() {
		return blockStartDate;
	}

	public void setBlockStartDate(LocalDate blockStartDate) {
		this.blockStartDate = blockStartDate;
	}

	public LocalDate getBlockEndDate() {
		return blockEndDate;
	}

	public void setBlockEndDate(LocalDate blockEndDate) {
		this.blockEndDate = blockEndDate;
	}

	/*public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}*/
}

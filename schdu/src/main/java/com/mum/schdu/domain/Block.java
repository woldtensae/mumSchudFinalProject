package com.mum.schdu.domain;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Block {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String blockMonth;
	private Date blockStartDate;
	private Date blockEndDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entry_id")
	private Entry entry;
	
	//private List<Section> sections;

	public long getId() {
		return id;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
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

	public Date getBlockStartDate() {
		return blockStartDate;
	}

	public void setBlockStartDate(Date blockStartDate) {
		this.blockStartDate = blockStartDate;
	}

	public Date getBlockEndDate() {
		return blockEndDate;
	}

	public void setBlockEndDate(Date blockEndDate) {
		this.blockEndDate = blockEndDate;
	}

	/*public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}*/
}

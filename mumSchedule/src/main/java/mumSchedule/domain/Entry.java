package mumSchedule.domain;

import java.time.LocalDate;
import java.util.List;

public class Entry {
	private int numberOfMPPEntry;
	private int numberOfFPPEntry;
	private List<Block> blocks;
	private LocalDate entryDate;
	
	
	
	public Entry(int numberOfMPPEntry, int numberOfFPPEntry, List<Block> blocks, LocalDate entryDate) {
		super();
		this.numberOfMPPEntry = numberOfMPPEntry;
		this.numberOfFPPEntry = numberOfFPPEntry;
		this.blocks = blocks;
		this.entryDate = entryDate;
	}
	public int getNumberOfMPPEntry() {
		return numberOfMPPEntry;
	}
	public void setNumberOfMPPEntry(int numberOfMPPEntry) {
		this.numberOfMPPEntry = numberOfMPPEntry;
	}
	public int getNumberOfFPPEntry() {
		return numberOfFPPEntry;
	}
	public void setNumberOfFPPEntry(int numberOfFPPEntry) {
		this.numberOfFPPEntry = numberOfFPPEntry;
	}
	public List<Block> getBlocks() {
		return blocks;
	}
	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}
	public LocalDate getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	
	
	
	
}

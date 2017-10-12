package mumSchedule.domain;

import javax.persistence.Entity;

//import java.time.LocalDate;
@Entity
public class Block {
	
	private String blockName;
	private String beginDate;
	private String endDate;
	
	public Block() {
		
	}
	
	public Block(String blockName, String beginDate, String endDate) {
		super();
		this.blockName = blockName;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getBlockName() {
		return this.blockName;
	}
}

package mumScheduler.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mumSchedule.domain.*;


import org.springframework.stereotype.Service;

@Service
public class BlockService {
	List<Block> blockList = new ArrayList<>(Arrays.asList(
			new Block("Feb","06/07/2017", "08/08/2017"),
			new Block("June","06/07/2017", "08/08/2017"),
			new Block("September","06/07/2017", "08/08/2017")
	));
	public List<Block> getAllBlocks(){
		return blockList;
	}
	
	public Block getBlock(String blockName) {
		System.out.println(blockName);
		//System.out.println(blockList.stream().filter(block -> block.getBlockName().equals(id)).findFirst().get());
		return blockList.stream().filter(block -> block.getBlockName().equals(blockName)).findFirst().get();
	}
	public void deleteBlock(String blockName) {
		for(int i=0; i<blockList.size();i++) {
			if(blockList.get(i).getBlockName().equals(blockName)) {
				blockList.remove(i);
			}
		}
	}
	public void addBlock(Block block) {
		blockList.add(block);
	}
	public void updateBlockName(Block block, String blockName) {
		for(int i=0; i<blockList.size();i++) {
			if(blockList.get(i).getBlockName().equals(blockName)) {
				blockList.set(i, block);
			}
		}
	}
}

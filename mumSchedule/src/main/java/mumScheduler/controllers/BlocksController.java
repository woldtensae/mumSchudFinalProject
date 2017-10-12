package mumScheduler.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mumSchedule.domain.Block;
import mumScheduler.service.BlockService;

@RestController
public class BlocksController {
	@Autowired
	private BlockService blockService;
	
	@RequestMapping("/blocks")
	public List<Block> readBlocks() {
		return blockService.getAllBlocks();
	}
	
	@RequestMapping("/block/{blockName}")
	public Block readBlock(@PathVariable String blockName) {
		return blockService.getBlock(blockName);
	}
	@RequestMapping(method=RequestMethod.DELETE, value ="/delete/{blockName}")
	public void deleteBlock(@PathVariable String blockName){
		blockService.deleteBlock(blockName);
	}
	@RequestMapping(method=RequestMethod.POST, value="/add")
	public void addBlock(@RequestBody Block block) {
		blockService.addBlock(block);
	}
	@RequestMapping(method=RequestMethod.PUT, value="update/{blockName}")
	public void updateBlock(@RequestBody Block block, @PathVariable String blockName) {
		blockService.updateBlockName(block, blockName);
	}
}

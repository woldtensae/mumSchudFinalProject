package com.mum.schdu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mum.schdu.domain.Block;

import com.mum.schdu.service.BlockService;


@Controller
public class BlockController {
	
	@Autowired
	private BlockService blockService;
	
	@RequestMapping({"/addBlock"})
	public /*@ResponseBody*/ String saveBlock(){
		return "addBlock";
	}	
	@RequestMapping(value= {"/addBlock"},method=RequestMethod.POST)
	public @ResponseBody String saveBlock(@ModelAttribute("block") Block newBlock){
		blockService.saveBlock(newBlock);
		return "saved";
	}
}

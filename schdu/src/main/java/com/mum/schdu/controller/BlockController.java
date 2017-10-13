package com.mum.schdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlockController {
	@RequestMapping({"/", "/add"})
	public /*@ResponseBody*/ String saveBlock(){
		return "enterBlock";
	}	
}

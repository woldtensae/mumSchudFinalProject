package com.mum.schdu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.mum.schdu.domain.Entry;
import com.mum.schdu.service.EntryService;




@Controller
public class EntryController {
	
	@Autowired
	private EntryService entryService;
	
	@RequestMapping(value= {"/addEntry"},method=RequestMethod.POST)
	public @ResponseBody String saveEntry(@ModelAttribute("entry") Entry newEntry){
		entryService.saveEntry(newEntry);
		return "saved";
	}
	@RequestMapping(path="/allEntry")
	public void getAllUsers(Model model) {
		// This returns a JSON or XML with the users
		List<Entry> entryList = entryService.getAllEntry();
		model.addAttribute("listOfEntries", entryList);
	}
}

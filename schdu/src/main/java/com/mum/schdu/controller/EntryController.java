package com.mum.schdu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.mum.schdu.domain.Entry;
import com.mum.schdu.service.EntryService;




@Controller
public class EntryController {
	private Long id_new;
	@Autowired
	private EntryService entryService;
	
	@RequestMapping(value= {"/addEntry"},method=RequestMethod.POST)
	public @ResponseBody String saveEntry(@ModelAttribute("entry") Entry newEntry){
		entryService.saveEntry(newEntry);
		return "saved";
	}
	
	@RequestMapping(value= {"/deleteEntry"},method=RequestMethod.POST)
	public RedirectView deleteEntry(@RequestParam String id){
		id_new = Long.valueOf(id);
		entryService.deleteEntry(id_new);
		return new RedirectView("/allEntry");
	}
	
	@RequestMapping(value= {"/findEntry"},method=RequestMethod.POST)
	public String findEntry(@RequestParam String id, Model model){
		id_new = Long.valueOf(id);
		Entry entryUpdate = entryService.getEntry(id_new);
		model.addAttribute("updatableEntry", entryUpdate);
		return "updateEntry";
	}
	
	@RequestMapping(value= {"/updateEntry"},method=RequestMethod.POST)
	public RedirectView updateEntry(@RequestParam String id, @RequestParam String entryMonth, @RequestParam int numOfMpp, 
			@RequestParam int numOfFpp, @RequestParam int numOfUSstudents){
		id_new = Long.valueOf(id);
		entryService.updateEntry(entryMonth, numOfFpp, numOfMpp, numOfUSstudents, id_new);
		return new RedirectView("/allEntry");
	}
	
	@RequestMapping(path="/allEntry")
	public String getAllUsers(Model model) {
		// This returns a JSON or XML with the users
		List<Entry> entryList = entryService.getAllEntry();
		model.addAttribute("listOfEntries", entryList);
		return "viewEntry";
	}
}

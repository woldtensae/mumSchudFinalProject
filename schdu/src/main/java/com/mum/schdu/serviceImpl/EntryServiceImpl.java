package com.mum.schdu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.schdu.dao.EntryDao;
import com.mum.schdu.domain.Entry;
import com.mum.schdu.service.EntryService;

@Service
public class EntryServiceImpl implements EntryService{
	
	@Autowired
	private EntryDao entryDao;

	@Override
	public void saveEntry(Entry entry) {
		entryDao.save(entry);
	}

	@Override
	public Entry getEntry(Long id) {
		return entryDao.findOne(id);
	}

	@Override
	public List<Entry> getAllEntry() {
		return (List<Entry>) entryDao.findAll();
	}

	@Override
	public Entry getEntryByMonth(String entryMonth) {
		return entryDao.findEntryByEntryMonth(entryMonth);
	}

	@Override
	public void deleteEntryk(Long id) {
		entryDao.delete(id);
		
	}

	@Override
	public void updateEntry(Entry entry) {
		entryDao.save(entry);
	}
}

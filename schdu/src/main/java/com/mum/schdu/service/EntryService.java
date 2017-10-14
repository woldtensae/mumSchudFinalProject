package com.mum.schdu.service;

import java.util.List;


import com.mum.schdu.domain.Entry;

public interface EntryService {
	public void saveEntry(Entry entry);
	public Entry getEntry(Long id);
	public List<Entry> getAllEntry();
	public Entry getEntryByMonth(String month);
	public void deleteEntryk(Long id);
	public void updateEntry(Entry entry);

}

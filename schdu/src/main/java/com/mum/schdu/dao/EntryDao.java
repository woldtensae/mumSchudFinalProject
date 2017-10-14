package com.mum.schdu.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.mum.schdu.domain.Entry;

public interface EntryDao extends CrudRepository<Entry, Long>{
	@Query("select e from Entry e where e.entryMonth = entryMonth")
	public Entry findEntryByEntryMonth(@Param("entryMonth") String entryMonth);

}

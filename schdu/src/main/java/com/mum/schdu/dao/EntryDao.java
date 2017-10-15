package com.mum.schdu.dao;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.schdu.domain.Entry;

public interface EntryDao extends CrudRepository<Entry, Long>{
	@Query("select e from Entry e where e.entryMonth = entryMonth")
	public Entry findEntryByEntryMonth(@Param("entryMonth") String entryMonth);
	
	@Modifying 
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false) 
	@Query(value = "update Entry e set e.entryMonth = ?1, e.numOfFpp = ?2, e.numOfMpp = ?3"
			+ ", e.numOfUSstudents = ?4  where e.id = ?5")
	public void update(@Param("entryMonth") String entryMonth
			, @Param("numOfFpp") int numOfFpp, @Param("numOfMpp") int numOfMpp, @Param("numOfUSstudents") int numOfUSstudents, @Param("id") Long id);

}

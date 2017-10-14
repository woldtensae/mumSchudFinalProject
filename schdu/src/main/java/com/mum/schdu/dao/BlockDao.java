package com.mum.schdu.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.mum.schdu.domain.Block;

public interface BlockDao extends CrudRepository<Block, Long> {
	@Query("select b from Block b where b.blockMonth = blockMonth")
	public Block findBlockByBlockMonth(@Param("blockMonth") String blockMonth);
}

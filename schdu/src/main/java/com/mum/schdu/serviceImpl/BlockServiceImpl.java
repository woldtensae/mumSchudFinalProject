package com.mum.schdu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.schdu.dao.BlockDao;
import com.mum.schdu.domain.Block;
import com.mum.schdu.service.BlockService;

@Service
public class BlockServiceImpl implements BlockService{
	
	@Autowired
	private BlockDao blockDao;
	
	@Override
	public void saveBlock(Block block) {
		blockDao.save(block);
		
	}

	@Override
	public Block getBlock(String blockMonth) {
		return blockDao.findBlockByBlockMonth(blockMonth);
	}

	@Override
	public List<Block> getAllBlock() {
		return (List<Block>) blockDao.findAll();
	}

	@Override
	public Block getBlockById(Long id) {
		return blockDao.findOne(id);
	}

	@Override
	public void deleteBlock(Long id) {
		blockDao.delete(id);
	}

	@Override
	public void updateBlock(Block block) {
		blockDao.save(block);
		
	}
}

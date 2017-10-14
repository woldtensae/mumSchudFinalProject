package com.mum.schdu.service;

import java.util.List;

import com.mum.schdu.domain.Block;

public interface BlockService {
	public void saveBlock(Block block);
	public Block getBlock(String id);
	public List<Block> getAllBlock();
	public Block getBlockById(Long id);
	public void deleteBlock(Long id);
	public void updateBlock(Block block);
}

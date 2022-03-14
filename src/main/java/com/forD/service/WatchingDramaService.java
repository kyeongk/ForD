package com.forD.service;

import java.util.List;

import com.forD.domain.Criteria;
import com.forD.domain.WatchingDramaVO;

public interface WatchingDramaService {
	public List<WatchingDramaVO> getList(Criteria cri);
	public int getTotalCount(Criteria cri);
	public void insert(WatchingDramaVO watchingDrama);
	public WatchingDramaVO detail(Long all_drama_id,String userid);
	public boolean remove(Long all_drama_id,String userid);
	public int checkWatchingTable(Long all_drama_id,String userid);
	
	//public List<WatchingDramaVO> getWatchingList(String userid);

}

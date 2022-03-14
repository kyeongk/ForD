package com.forD.service;

import java.util.List;

import com.forD.domain.Criteria;
import com.forD.domain.WatchedDramaVO;

public interface WatchedDramaService {
	public List<WatchedDramaVO> getList(Criteria cri);
	public int getTotalCount(Criteria cri);
	public void insert(WatchedDramaVO watchedDrama);
	public WatchedDramaVO detail(Long all_drama_id,String userid);
	public boolean remove(Long all_drama_id,String userid);
	public boolean modify(WatchedDramaVO watchedDrama);
	public int checkWatchedTable(Long all_drama_id,String userid);
	public boolean modifyAvgScore(Long id);
	public boolean modifyViewCount(Long id);

}

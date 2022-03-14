package com.forD.service;

import java.util.List;

import com.forD.domain.AdminBoardVO;
import com.forD.domain.BoardAttachVO;
import com.forD.domain.Criteria;

public interface AdminBoardService {
	public List<AdminBoardVO> getNoticeList(Criteria cri);
	public int getNoticeTotalCount(Criteria cri);
	public List<AdminBoardVO> getFAQList(Criteria cri);
	public int getFAQTotalCount(Criteria cri);
	public void insert(AdminBoardVO adminBoard);
	public AdminBoardVO detail(Long id);
	public boolean modify(AdminBoardVO adminBoard);
	public boolean remove(Long id);
	public List<BoardAttachVO> getAttachList(Long id);

}

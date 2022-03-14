package com.forD.mapper;

import java.util.List;

import com.forD.domain.AdminBoardVO;
import com.forD.domain.Criteria;

public interface AdminBoardMapper {
	public List<AdminBoardVO> getNoticeList(Criteria cri);
	public int getNoticeTotalCount(Criteria cri);
	public List<AdminBoardVO> getFAQList(Criteria cri);
	public int getFAQTotalCount(Criteria cri);
	public void insertSelectKey(AdminBoardVO adminBoard);
	public AdminBoardVO detail(Long id);
	public int modify(AdminBoardVO adminBoard);
	public int remove(Long id);

}

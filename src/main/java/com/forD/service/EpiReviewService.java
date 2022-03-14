package com.forD.service;

import java.util.List;

import com.forD.domain.Criteria;
import com.forD.domain.EpiReviewPageDTO;
import com.forD.domain.EpiReviewVO;

public interface EpiReviewService {
	public List<EpiReviewVO> getList(Criteria cri, Long all_drama_id, String userid);
	public EpiReviewPageDTO getListPage(Criteria cri, Long all_drama_id, String userid);
	public int insert(EpiReviewVO epiReview);
	public int modifyScore(EpiReviewVO epiReview);
	public int modify(EpiReviewVO epiReview);
	public EpiReviewVO detail(Long id);
	public int remove(Long id);
	public int removeAll(Long all_drama_id, String userid);
	public int modifyViewState(EpiReviewVO epiReview);
	public int modifyViewStateAll(EpiReviewVO epiReview);
	
	
}

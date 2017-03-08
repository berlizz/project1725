package com.berlizz.persistence;

import java.util.List;

import com.berlizz.domain.ListVO;

public interface ListDAO {

	public List<ListVO> listAll() throws Exception;
	
	public List<ListVO> listSelect(String regDate) throws Exception;
	
	public ListVO listSelectOne(Integer listNumber) throws Exception;
	
	public List<ListVO> uncompletedSelect() throws Exception;
	
	public List<ListVO> completedSelect() throws Exception;
	
	public void createList(ListVO vo) throws Exception;
	
	public void updateList(ListVO vo) throws Exception;
	
	public void completionUpdate(Integer listNumber) throws Exception;
	
	public void deleteList(Integer listNumber) throws Exception;
	
	public void addAttach(String fullName, Integer listNumber) throws Exception;
	
	public List<String> getAttach(Integer listNumber) throws Exception;
	
	public void deleteAttach(String fullName) throws Exception;
	
	public void updateAttachCount(Integer variation, Integer listNumber) throws Exception;
	
	public void updateReplyCount(Integer variation, Integer listNumber) throws Exception;
	
}

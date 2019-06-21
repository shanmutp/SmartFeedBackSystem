package com.smartfeedback.service;

import java.util.List;

import com.smartfeedback.bo.SubjectBO;
import com.smartfeedback.dao.SubjectDAO;
import com.smartfeedback.vo.SearchSubjectVO;
import com.smartfeedback.vo.SubjectVO;

public class SubjectService {
	
	public void addSubject(SubjectVO vo)
	{
		SubjectBO bo = new SubjectBO();
		bo.addSubject(vo);
	}
	public List<SearchSubjectVO> fetchSubject(String name)
	{
		SubjectBO bo = new SubjectBO();
		return bo.fetchSubject(name);
	}
	public SearchSubjectVO fetchSubject(int id)
	{
		SubjectBO bo = new SubjectBO();
		return bo.fetchSubject(id);
	}
	public void updateSubject(SubjectVO vo)
	{
		SubjectBO bo = new SubjectBO();
		bo.updateSubject(vo);
	}
}

package com.smartfeedback.bo;

import java.util.List;

import com.smartfeedback.dao.SubjectDAO;
import com.smartfeedback.vo.SearchSubjectVO;
import com.smartfeedback.vo.SubjectVO;

public class SubjectBO {
	public void addSubject(SubjectVO vo)
	{
		SubjectDAO dao = new SubjectDAO();
		dao.saveSubject(vo);
	}
	public List<SearchSubjectVO> fetchSubject(String name)
	{
		SubjectDAO dao = new SubjectDAO();
		return dao.fetchSubjects(name);
	}
	public SearchSubjectVO fetchSubject(int id)
	{
		SubjectDAO dao = new SubjectDAO();
		return dao.fetchSubject(id);
	}
	public void updateSubject(SubjectVO vo)
	{
		SubjectDAO dao = new SubjectDAO();
		dao.updateSubject(vo);
	}
}

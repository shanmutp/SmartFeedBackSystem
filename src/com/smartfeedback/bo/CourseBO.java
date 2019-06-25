package com.smartfeedback.bo;

import java.util.List;

import com.smartfeedback.dao.CourseDAO;
import com.smartfeedback.dao.SubjectDAO;
import com.smartfeedback.vo.CourseVO;
import com.smartfeedback.vo.SearchSubjectVO;
import com.smartfeedback.vo.SubjectVO;

public class CourseBO {
	public void addCourse(CourseVO vo) {
		CourseDAO dao = new CourseDAO();
		dao.saveCourse(vo);
	}

	public List<CourseVO> fetchCourses(String name) {
		CourseDAO dao = new CourseDAO();
		return dao.fetchCourses(name);
	}

	public CourseVO fetchCourse(int id) {
		CourseDAO dao = new CourseDAO();
		return dao.fetchcourse(id);
	}
	public void updateCourse(CourseVO vo)
	{
		CourseDAO dao = new CourseDAO();
		dao.updateCourse(vo);
	}
}

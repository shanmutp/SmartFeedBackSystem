package com.smartfeedback.service;

import java.util.List;

import com.smartfeedback.bo.CourseBO;
import com.smartfeedback.bo.SubjectBO;
import com.smartfeedback.vo.CourseVO;
import com.smartfeedback.vo.SearchSubjectVO;

public class CourseService {
		public void addCourse(CourseVO vo)
		{
			CourseBO bo = new CourseBO();
			bo.addCourse(vo);
		}
		
		public List<CourseVO> fetchCourses(String name)
		{
			CourseBO bo = new CourseBO();
			return bo.fetchCourses(name);
		}
		public CourseVO fetchCourse(int id)
		{
			CourseBO bo = new CourseBO();
			return bo.fetchCourse(id);
		}

}

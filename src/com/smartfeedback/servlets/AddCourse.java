package com.smartfeedback.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfeedback.service.CourseService;
import com.smartfeedback.vo.CourseVO;

/**
 * Servlet implementation class AddCourse
 */
@WebServlet("/AddCourse")
public class AddCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// int courseId = Integer.parseInt(request.getParameter("courseID"));
		String courseName = request.getParameter("courseName");
		String courseDescription = request.getParameter("courseDescription");

		PrintWriter out = response.getWriter();
		out.println("Course Name:" + courseName);
		out.println("Course Description:" + courseDescription);

		CourseVO vo = new CourseVO();
		// vo.setSubjectId(subjectId);
		vo.setCourseName(courseName);
		vo.setCourseDescription(courseDescription);
		CourseService service = new CourseService();
		service.addCourse(vo);
		request.setAttribute("vo", vo);
		RequestDispatcher successDispatcher = request.getRequestDispatcher("/Course/AddCourse.jsp");
		successDispatcher.forward(request, response);

	}

}

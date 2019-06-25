package com.smartfeedback.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfeedback.service.CourseService;
import com.smartfeedback.vo.CourseVO;

/**
 * Servlet implementation class EditCourse
 */
@WebServlet("/EditCourse")
public class EditCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String CourseName = request.getParameter("courseName");
		String CourseDescription = request.getParameter("courseDescription");
		int CourseId = Integer.parseInt(request.getParameter("courseId"));
		
		System.out.println(CourseName);
		System.out.println(CourseDescription);

		CourseVO vo = new CourseVO();
		vo.setCourseID(CourseId);
		System.out.println(CourseId);
		vo.setCourseName(CourseName);
		vo.setCourseDescription(CourseDescription);
		CourseService service = new CourseService();
		service.updateCourse(vo);
		request.setAttribute("vo", vo);
		RequestDispatcher successDispatcher = request.getRequestDispatcher("CourseUpdate.jsp");
		successDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

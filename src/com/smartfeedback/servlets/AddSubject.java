package com.smartfeedback.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfeedback.service.SubjectService;
import com.smartfeedback.vo.SubjectVO;

/**
 * Servlet implementation class AddSubject
 */
@WebServlet("/AddSubject")
public class AddSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSubject() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String specializationName = request.getParameter("specializationName");
		String courseName = request.getParameter("courseName");
		String subjectName = request.getParameter("subjectName");
		int courseId = Integer.parseInt(request.getParameter("courseName"));
		int specializationId = Integer.parseInt(request.getParameter("specializationName"));
		String subjectId = request.getParameter("subjectName");

		

		SubjectVO vo = new SubjectVO();
		vo.setCourseId(courseId);
		vo.setSpecializationId(specializationId);
		// vo.setSubjectId(subjectId);
		vo.setSubjectName(subjectName);
		SubjectService service = new SubjectService();
		service.addSubject(vo);
		request.setAttribute("vo", vo);
		RequestDispatcher successDispatcher = request.getRequestDispatcher("/Subject/AddSubjects.jsp");
		successDispatcher.forward(request, response);

	}

}

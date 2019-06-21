package com.smartfeedback.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfeedback.service.SubjectService;
import com.smartfeedback.vo.SubjectVO;

/**
 * Servlet implementation class EditSubject
 */
@WebServlet("/EditSubject")
public class EditSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditSubject() {
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
		
		String specializationName = request.getParameter("specializationName");
		String subjectName = request.getParameter("subjectName");
		int specializationId = Integer.parseInt(request.getParameter("specializationName"));
		int subjectId = new Integer(request.getParameter("subjectId"));
		int courseId = new Integer(request.getParameter("courseIdHidden"));

		SubjectVO vo = new SubjectVO();
		vo.setSpecializationId(specializationId);
		vo.setSubjectId(subjectId);
		vo.setCourseId(courseId);
		vo.setSubjectName(subjectName);
		SubjectService service = new SubjectService();
		service.updateSubject(vo);
		request.setAttribute("vo", vo);
		RequestDispatcher successDispatcher = request.getRequestDispatcher("SubjectUpdate.jsp");
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

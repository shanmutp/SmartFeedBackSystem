package com.smartfeedback.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfeedback.service.SubjectService;
import com.smartfeedback.vo.SearchSubjectVO;

/**
 * Servlet implementation class SubjectFectForEdit
 */
@WebServlet("/SubjectFetchForEdit")
public class SubjectFetchForEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubjectFetchForEdit() {
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
		String id = request.getParameter("id");
		SubjectService service = new SubjectService();
		SearchSubjectVO vo = service.fetchSubject(new Integer(id));
		System.out.println("vo---->"+vo);
		request.setAttribute("subjectVO", vo);
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

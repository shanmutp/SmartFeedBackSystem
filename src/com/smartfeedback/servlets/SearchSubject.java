package com.smartfeedback.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smartfeedback.service.SubjectService;
import com.smartfeedback.vo.SearchSubjectVO;

/**
 * Servlet implementation class SearchSubject
 */
@WebServlet("/SearchSubject")
public class SearchSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext ctx = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchSubject() {
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
		String subjectName = request.getParameter("subjectName");
		SubjectService service = new SubjectService();
		List<SearchSubjectVO> list = service.fetchSubject(subjectName);
		request.setAttribute("subjectList", list);
		RequestDispatcher successDispatcher = request.getRequestDispatcher("SubjectList.jsp");
		successDispatcher.forward(request, response);

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.ctx=config.getServletContext();
		super.init(config);
	}

}

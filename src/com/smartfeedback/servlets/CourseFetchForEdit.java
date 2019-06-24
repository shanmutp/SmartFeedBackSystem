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
 * Servlet implementation class CourseFetchForEdit
 */
@WebServlet("/CourseFetchForEdit")
public class CourseFetchForEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseFetchForEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id = request.getParameter("id");
		CourseService service = new CourseService();
		CourseVO vo = service.fetchCourse(new Integer(id));
		System.out.println("vo---->"+vo);
		request.setAttribute("CourseVO", vo);
		
		RequestDispatcher successDispatcher = request.getRequestDispatcher("CourseUpdate.jsp");
		successDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.smartfeedback.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfeedback.service.CourseService;
import com.smartfeedback.vo.CourseVO;

/**
 * Servlet implementation class SearchCourse
 */
@WebServlet("/SearchCourse")
public class SearchCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext ctx = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.ctx=config.getServletContext();
		super.init(config);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String courseName = request.getParameter("courseName");
		CourseService service = new CourseService();
		List<CourseVO> list = service.fetchCourses(courseName);
		request.setAttribute("courseList", list);
		RequestDispatcher successDispatcher = request.getRequestDispatcher("courseList.jsp");
		successDispatcher.forward(request, response);

	}

}

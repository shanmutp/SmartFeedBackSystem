package com.smartfeedback.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.smartfeedback.vo.CourseVO;
import com.smartfeedback.vo.CourseVO;

public class CourseDAO {
	public void saveCourse(CourseVO vo) {
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;

		try {
			System.out.println("Trying to laod driver ************************");
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection

			("jdbc:mysql://localhost:3306/smartfeedback", "root", "root123");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn
					.prepareStatement("insert into Course(Course_id,course_name,course_description) values(?,?,?)");
			ps.setInt(1, vo.getCourseID());
			ps.setString(2, vo.getCourseName());
			ps.setString(3, vo.getCourseDescription());
			ps.executeUpdate();
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			try {
				if (myrs != null) {
					myrs.close();
				}
				if (myst != null) {
					myst.close();
				}
				if (myconn != null) {
					myconn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<CourseVO> fetchCourses(String name) {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;
		List<CourseVO> list = new ArrayList<CourseVO>();
		try {
			System.out.println("Trying to laod driver ************************" + name);
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartfeedback", "root", "root123");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn.prepareStatement(
					"select course_id,course_name,course_description FROM course where course_name like ?");
			String clause = "%" + name + "%";
			System.out.println("Clause=" + clause);
			ps.setString(1, clause);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CourseVO vo = new CourseVO();
				vo.setCourseID(rs.getInt(1));
				vo.setCourseName(rs.getString(2));
				vo.setCourseDescription(rs.getString(3));
				list.add(vo);
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			try {
				if (myrs != null) {
					myrs.close();
				}
				if (myst != null) {
					myst.close();
				}
				if (myconn != null) {
					myconn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public CourseVO fetchcourse(int id) {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;
		CourseVO vo = null;
		List<CourseVO> list = new ArrayList<CourseVO>();
		try {
			System.out.println("Trying to laod driver ************************" + id);
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartfeedback", "root", "root123");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn
					.prepareStatement("select course_id,course_name,course_description from course where course_id=? ");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = new CourseVO();
				vo.setCourseID(rs.getInt(1));
				vo.setCourseName(rs.getString(2));
				vo.setCourseDescription(rs.getString(3));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			try {
				if (myrs != null) {
					myrs.close();
				}
				if (myst != null) {
					myst.close();
				}
				if (myconn != null) {
					myconn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}
}

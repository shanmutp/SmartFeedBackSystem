package com.smartfeedback.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.smartfeedback.vo.SearchSubjectVO;
import com.smartfeedback.vo.SubjectVO;

public class SubjectDAO {
	public void saveSubject(SubjectVO vo) {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;

		try {
			System.out.println("Trying to laod driver ************************");
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart", "root", "password");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn
					.prepareStatement("insert into subjects(subject_name,course_id,specialization_id) values(?,?,?)");
			ps.setString(1, vo.getSubjectName());
			ps.setInt(2, vo.getCourseId());
			ps.setInt(3, vo.getSpecializationId());
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

	public List<SearchSubjectVO> fetchSubjects(String name) {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;
		List<SearchSubjectVO> list = new ArrayList<SearchSubjectVO>();
		try {
			System.out.println("Trying to laod driver ************************"+name);
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart", "root", "password");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn.prepareStatement(
					"select subject_id,subject_name,course_name,specialization_name,s.course_id,s.specialization_id FROM subjects s inner join  course c inner join specialization sp on c.course_id=s.course_id and sp.specialization_id=s.specialization_id and s.subject_name like ? ");
			String clause = "%" + name + "%";
			System.out.println("Clause="+clause);
			ps.setString(1, clause);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SearchSubjectVO vo = new SearchSubjectVO();
				vo.setSubjectId(rs.getInt(1));
				vo.setSubjectName(rs.getString(2));
				vo.setCourseName(rs.getString(3));
				vo.setSpecializationName(rs.getString(4));
				vo.setCourseId(rs.getInt(5));
				vo.setSpecializationId(rs.getInt(6));
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
	
	public SearchSubjectVO fetchSubject(int id) {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;
		SearchSubjectVO vo = null;
		List<SearchSubjectVO> list = new ArrayList<SearchSubjectVO>();
		try {
			System.out.println("Trying to laod driver ************************"+id);
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart", "root", "password");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn.prepareStatement(
					"select subject_id,subject_name,course_name,specialization_name,s.course_id,s.specialization_id FROM subjects s inner join  course c inner join specialization sp on c.course_id=s.course_id and sp.specialization_id=s.specialization_id and s.subject_id =? ");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = new SearchSubjectVO();
				vo.setSubjectId(rs.getInt(1));
				vo.setSubjectName(rs.getString(2));
				vo.setCourseName(rs.getString(3));
				vo.setSpecializationName(rs.getString(4));
				vo.setCourseId(rs.getInt(5));
				vo.setSpecializationId(rs.getInt(6));
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
	
	public void updateSubject(SubjectVO vo) {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;

		try {
			System.out.println("Trying to laod driver ************************");
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart", "root", "password");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn
					.prepareStatement("update subjects set subject_name = ? ,specialization_id =? where subject_id=?");
			ps.setString(1, vo.getSubjectName());
			ps.setInt(2, vo.getSpecializationId());
			ps.setInt(3, vo.getSubjectId());
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

}

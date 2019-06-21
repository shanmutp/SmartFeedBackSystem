package com.smartfeedback.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.smartfeedback.vo.SearchSubjectVO;

public class MasterDataDAO {

	public Map<Integer, String> fetchSpecialization() {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart", "root", "password");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn
					.prepareStatement("select specialization_id,specialization_name FROM specialization");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				map.put(rs.getInt(1), rs.getString(2));
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
		return map;
	}
	
	public Map<Integer, String> fetchCourse() {
		// insert into DB
		Connection myconn = null;
		Statement myst = null;
		ResultSet myrs = null;
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart", "root", "password");
			System.out.println("db connection" + myconn);
			myst = myconn.createStatement();
			PreparedStatement ps = myconn
					.prepareStatement("select course_id,course_name FROM course");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				map.put(rs.getInt(1), rs.getString(2));
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
		return map;
	}

}

package com.smartfeedback.vo;

public class CourseVO {
	private int courseID;
	private String courseName;
	private String courseDescription;

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "CourseVO [courseID=" + courseID + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + "]";
	}

}

package com.smartfeedback.vo;

public class SubjectVO {

	private int specializationId;

	private int courseId;

	private int subjectId;

	private String subjectName;

	@Override
	public String toString() {
		return "SubjectVO [specializationId=" + specializationId + ", courseId=" + courseId + ", subjectId=" + subjectId
				+ ", subjectName=" + subjectName + "]";
	}

	public int getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}

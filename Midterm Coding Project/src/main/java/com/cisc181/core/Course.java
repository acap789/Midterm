package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;

	public UUID getCourseID() {
		return CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String coursename) {
		CourseName = coursename;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradepoints) {
		GradePoints = gradepoints;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	}

}

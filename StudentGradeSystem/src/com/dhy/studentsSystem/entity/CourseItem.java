package com.dhy.studentsSystem.entity;

import java.sql.SQLNonTransientConnectionException;

public class CourseItem {
	private String courseNumber;
	private String courseName;
	private String studentNumber;
	private String studentName;
	private String studentScore;
	private String teacherName;
	private String teacherNumber;
	public CourseItem() {
		
	}public CourseItem(String courseNumber,String courseName,String studentNumber,String studentName,String studentScore,String teacherNumber,String teacherName){
		this.courseNumber=courseNumber;
		this.courseName=courseName;
		this.studentNumber=studentNumber;
		this.studentName=studentName;
		this.studentScore=studentScore;
		this.teacherNumber=teacherNumber;
		this.teacherName=teacherName;
	}public String getCourseNumber() {
		return courseNumber;
	}public void setCourseNumber(String courseNumber) {
		this.courseNumber=courseNumber;
	}public String getCourseName() {
		return courseName;
	}public void setCourseName(String courseName) {
		this.courseName=courseName;
	}public String getStudentNumber() {
		return studentNumber;
	}public void setStudentNumber(String studentNumber) {
		this.studentNumber=studentNumber;
	}public String getStudentName() {
		return studentName;
	}public void setStudentName(String studentName) {
		this.studentName=studentName;
	}public String getStudentScore() {
		return studentScore;
	}public void setStudentScore(String studentScore) {
		this.studentScore=studentScore;
	}public String getTeacherName() {
		return teacherName;
	}public void setTeacherName(String teacherName) {
		this.teacherName=teacherName;
	}public String getTeacherNumber() {
		return teacherName;
	}public void setTeacher(String teacherNumber) {
		this.teacherNumber=teacherNumber;
	}

}
